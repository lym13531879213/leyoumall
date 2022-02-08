package cn.com.mall.operator.pojo.po;

import lombok.Data;

import java.util.List;

@Data
public class AttributePO {
    private Long attrGroupId;
    private List<Long> attrIds;
}
