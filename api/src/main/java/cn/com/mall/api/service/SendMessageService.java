package cn.com.mall.api.service;

import cn.com.mall.common.EmailDTO;

/**
 * @author liaoyuming
 * @date 2022/2/1 13:15
 * @Description 发送邮件服务
 */
public interface SendMessageService {
    void sendMessage(String key, EmailDTO dto);

    boolean validateCode(String key, String email, String code);
}
