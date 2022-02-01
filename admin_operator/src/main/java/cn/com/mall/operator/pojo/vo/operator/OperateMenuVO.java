package cn.com.mall.operator.pojo.vo.operator;

import cn.com.mall.entity.OperateMenu;
import lombok.Data;

import java.util.List;

@Data
public class OperateMenuVO {
    private Long id;
    private String label;
    private String url;
    private List<OperateMenu> children;
}
