package cn.com.mall.service.impl;

import cn.com.mall.entity.OperateUser;
import cn.com.mall.entity.PmsBrand;
import cn.com.mall.pojo.dto.pms.AddBrandDTO;
import cn.com.mall.pojo.dto.pms.ModifyBrandDTO;
import cn.com.mall.service.OperateUserService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.mapper.PmsBrandMapper;
import cn.com.mall.service.PmsBrandService;

import java.util.List;

@Service
public class PmsBrandServiceImpl implements PmsBrandService{

    @Resource
    private PmsBrandMapper pmsBrandMapper;

    @Autowired
    private OperateUserService operateUserService;

    @Override
    public List<PmsBrand> getPage(Object page, Long brandId, String name, Integer showStatus, String firstLetter) {
        PageHelper.startPage(page);
        return pmsBrandMapper.getList(brandId,name,showStatus,firstLetter);
    }

    @Override
    public boolean addBrand(AddBrandDTO addBrandDTO) {
        PmsBrand pmsBrand = new PmsBrand();
        BeanUtils.copyProperties(addBrandDTO,pmsBrand);
        return pmsBrandMapper.addBrand(pmsBrand);
    }

    @Override
    public boolean deleteBrand(Long brandId) {
        return pmsBrandMapper.deleteBrand(brandId);
    }

    @Override
    public boolean modifyBrand(Long brandId, ModifyBrandDTO dto) {
        return pmsBrandMapper.modifyBrand(brandId,dto.getName(),dto.getLogo(),dto.getDescription(),dto.getShowStatus(),dto.getSort());
    }

    @Override
    public PmsBrand getBrandById(Long brandId) {
        return pmsBrandMapper.getBrandById(brandId);
    }

    @Override
    public boolean switchStatus(Long brandId, Integer showStatus) {
        return pmsBrandMapper.switchStatus(brandId,showStatus);
    }
}
