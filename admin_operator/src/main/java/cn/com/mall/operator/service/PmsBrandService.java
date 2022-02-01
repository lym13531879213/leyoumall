package cn.com.mall.operator.service;

import cn.com.mall.entity.PmsBrand;
import cn.com.mall.operator.pojo.dto.pms.AddBrandDTO;
import cn.com.mall.operator.pojo.dto.pms.ModifyBrandDTO;

import java.util.List;

public interface PmsBrandService{


    List<PmsBrand> getPage(Object page, Long brandId, String name, Integer showStatus, String firstLetter);

    boolean addBrand(AddBrandDTO dto);

    boolean deleteBrand(Long brandId);

    boolean modifyBrand(Long brandId, ModifyBrandDTO dto);

    PmsBrand getBrandById(Long brandId);

    boolean switchStatus(Long brandId, Integer showStatus);
}
