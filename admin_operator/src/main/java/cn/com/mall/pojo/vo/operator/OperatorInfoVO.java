package cn.com.mall.pojo.vo.operator;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OperatorInfoVO {
    private Long userId;
    private String username;
    private String headImg;
}
