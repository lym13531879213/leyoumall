package cn.com.mall.operator.pojo.vo.pms;

import lombok.Data;

import java.util.List;

/**
 * @author liaoyuming
 * @date 2022/2/7 10:36
 * @Description 分类【id/name】列表
 */
@Data
public class CategoryListVO {
    private List<Long> ids;
    private List<String> names;
}
