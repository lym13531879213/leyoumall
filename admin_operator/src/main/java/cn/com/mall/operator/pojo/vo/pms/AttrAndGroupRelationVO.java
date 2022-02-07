package cn.com.mall.operator.pojo.vo.pms;

import lombok.Data;

@Data
public class AttrAndGroupRelationVO {
    private Long id;
    private Long attrId;
    private String attrName;
    private Long attrGroupId;
    private String attrGroupName;
    private Integer sort;
}
