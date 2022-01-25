package cn.com.mall.pojo.dto.pms;

import lombok.Data;

@Data
public class TransferCategoryDTO {
    private Long childCatId;
    private Long parentCatId;
}
