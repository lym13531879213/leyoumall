package cn.com.mall.service;

import cn.com.mall.entity.PmsCategory;
import cn.com.mall.pojo.dto.pms.AddCategoryDTO;
import cn.com.mall.pojo.dto.pms.ModifyCategoryDTO;
import cn.com.mall.pojo.dto.pms.TransferCategoryDTO;
import cn.com.mall.pojo.vo.pms.ModifyCategoryVO;

import java.util.List;

public interface PmsCategoryService {

    List<PmsCategory> getPage(Object page, Long catId, String name, Long parentCid, Integer catLevel, Integer showStatus);

    boolean switchStatus(Long catId, Integer showStatus);

    boolean deleteCategory(Long catId);

    ModifyCategoryVO getModifyCategoryVO(Long catId);

    boolean modifyCategory(Long catId, ModifyCategoryDTO dto);

    boolean addCategory(AddCategoryDTO dto);

    List<Long> getChildren(Long catId);

    boolean transferCategory(TransferCategoryDTO dto);

    Integer checkLevelLen(Long catId);

}
