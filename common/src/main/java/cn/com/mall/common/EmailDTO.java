package cn.com.mall.common;

import lombok.Data;

@Data
public class EmailDTO {

    /**
     * 接收者email
     */
    private String recipient;
    /**
     * 邮件标题
     */
    private String subject;
    /**
     * 邮件内容
     */
    private String content;

}
