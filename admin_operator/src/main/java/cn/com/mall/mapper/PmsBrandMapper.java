package cn.com.mall.mapper;

import cn.com.mall.entity.PmsBrand;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface PmsBrandMapper {
    List<PmsBrand> getList(@Param("brandId") Long brandId, @Param("name") String name, @Param("showStatus") Integer showStatus, @Param("firstLetter") String firstLetter);

    PmsBrand getBrandById(@Param("brandId") Long brandId);

    boolean addBrand(PmsBrand pmsBrand);

    @Update("update leyoumall.pms_brand set deleted = 1,update_time= now() where brand_id=#{brandId}")
    boolean deleteBrand(Long brandId);

    boolean modifyBrand(@Param("brandId") Long brandId, @Param("name") String name, @Param("logo") String logo, @Param("description") String description,
                        @Param("showStatus") Integer showStatus, @Param("sort") Integer sort);

    boolean switchStatus(@Param("brandId") Long brandId, @Param("showStatus") Integer showStatus);
}