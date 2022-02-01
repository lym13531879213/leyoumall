package cn.com.mall.operator.service.impl;

import cn.com.mall.entity.PmsCategory;
import cn.com.mall.operator.mapper.PmsCategoryMapper;
import cn.com.mall.operator.pojo.dto.pms.AddCategoryDTO;
import cn.com.mall.operator.pojo.dto.pms.ModifyCategoryDTO;
import cn.com.mall.operator.pojo.dto.pms.TransferCategoryDTO;
import cn.com.mall.operator.pojo.vo.pms.ModifyCategoryVO;
import cn.com.mall.operator.service.PmsCategoryService;
import cn.com.mall.utils.AssertUtil;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author liaoyuming
 * @date 2022/1/2 16:10
 */
@Service
public class PmsCategoryServiceImpl implements PmsCategoryService {

    @Resource
    private PmsCategoryMapper pmsCategoryMapper;

    @Override
    public List<PmsCategory> getPage(Object page, Long catId, String name, Long parentCid, Integer catLevel, Integer showStatus) {
        PageHelper.startPage(page);
        return pmsCategoryMapper.getList(catId, name, parentCid, catLevel, showStatus);
    }

    @Override
    public boolean switchStatus(Long catId, Integer showStatus) {
        boolean exist = pmsCategoryMapper.isExist(catId);
        AssertUtil.isTrue(exist, "商品分类不存在");
        return pmsCategoryMapper.switchStatus(catId, showStatus);
    }

    @Override
    public boolean deleteCategory(Long catId) {
        boolean exist = pmsCategoryMapper.isExist(catId);
        AssertUtil.isTrue(exist, "商品分类不存在");
        //找出该分类下的所有分类
        List<Long> deleteIdList = this.getChildren(catId);
        deleteIdList.forEach(System.out::println);
        System.out.println("size:" + deleteIdList.size());
        //逻辑删除
        return pmsCategoryMapper.deleteCategory(deleteIdList);
    }

    @Override
    public ModifyCategoryVO getModifyCategoryVO(Long catId) {
        boolean exist = pmsCategoryMapper.isExist(catId);
        AssertUtil.isTrue(exist, "商品分类不存在");
        return pmsCategoryMapper.getModifyCategoryVO(catId);
    }

    @Override
    public boolean modifyCategory(Long catId, ModifyCategoryDTO dto) {
        return pmsCategoryMapper.modifyCategory(catId, dto.getName(), dto.getProductUnit(), dto.getSort());
    }

    @Override
    public boolean addCategory( AddCategoryDTO dto) {
        PmsCategory parentCategory = pmsCategoryMapper.getCategory(dto.getParentCid());
        if (parentCategory == null && dto.getParentCid() != 0) {
            throw new RuntimeException("该上一级商品分类不存在");
        }
        Integer parentCatLevel = parentCategory == null ? 0 : parentCategory.getCatLevel();
        if (!dto.getCatLevel().equals(parentCatLevel + 1)) {
            throw new RuntimeException("所选的层级与上一级商品分类层级不匹配");
        }
        PmsCategory pmsCategory = new PmsCategory();
        BeanUtils.copyProperties(dto, pmsCategory);
        pmsCategory.setCreateTime(new Date());
        pmsCategory.setUpdateTime(new Date());
        return pmsCategoryMapper.addCategory(pmsCategory);
    }

    @Override
    public List<Long> getChildren(Long catId) {
        ArrayList<Long> childrenIdList = new ArrayList<>();
        List<Long> children = pmsCategoryMapper.getChildren(catId);
        PmsCategory category = pmsCategoryMapper.getCategory(catId);
        //将当前分类加入列表中
        childrenIdList.add(catId);
        //将子分类加入列表，如果已经是第3级或没有子分类则返回
        if (category.getCatLevel() == 3 || children.size() == 0) {
            return childrenIdList;
        } else {
            children.forEach(id -> {
                List<Long> list = this.getChildren(id);
                if (list != null) {
                    childrenIdList.addAll(list);
                }

            });
            return childrenIdList;
        }
    }

    @Override
    public boolean transferCategory(TransferCategoryDTO dto) {
        PmsCategory parentCategory = pmsCategoryMapper.getCategory(dto.getParentCatId());
        if (parentCategory.getCatLevel() + checkLevelLen(dto.getChildCatId()) > 3) {
            throw new RuntimeException("层级不能超过3层");
        }
        Integer parentCatLevel = 0;
        if (parentCategory.getCatId() != 0) {
            parentCatLevel = parentCategory.getCatLevel();
        }
        boolean result = false;
        result = pmsCategoryMapper.transferCategory(Arrays.asList(dto.getChildCatId()), parentCatLevel, dto.getParentCatId());
        PmsCategory childCategory = pmsCategoryMapper.getCategory(dto.getChildCatId());
        List<Long> children = this.getChildren(dto.getChildCatId());
        if (children != null) {
            result = pmsCategoryMapper.transferCategory(children, childCategory.getCatLevel(), childCategory.getCatId());
        }
        return result;
    }

    @Override
    public Integer checkLevelLen(Long catId) { //1
        AtomicInteger len = new AtomicInteger(1);
        PmsCategory category = pmsCategoryMapper.getCategory(catId);
        List<Long> children = pmsCategoryMapper.getChildren(catId);
        if (category.getCatLevel() == 3) {
            return len.get();
        } else {
            AtomicInteger max = new AtomicInteger(0);
            if (children == null) {
                return len.get();
            }
            children.forEach(id -> {
                Integer size = checkLevelLen(id) + 1;
                max.set(max.get() > size ? max.get() : size);
            });
            len.set(max.get());
        }
        return len.get();
    }

}
