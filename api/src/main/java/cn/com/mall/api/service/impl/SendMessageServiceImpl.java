package cn.com.mall.api.service.impl;

import cn.com.mall.api.service.SendMessageService;
import cn.com.mall.common.EmailDTO;
import cn.com.mall.utils.RandomUtil;
import cn.com.mall.utils.SendEmailUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class SendMessageServiceImpl implements SendMessageService {

    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public void sendMessage(String key, EmailDTO dto) {
        key +=":"+dto.getRecipient();
        if (redisTemplate.hasKey(key)) {
            Long lastSendTime = (Long) redisTemplate.opsForHash().get(key, "lastSendTime");
            Long current = System.currentTimeMillis();
            if ( current - lastSendTime <= 60000) {
                throw new RuntimeException("验证码60s内只能发送一次");
            }else{
                //重新发送一次
                String code = RandomUtil.generateRandomString(6);
                dto.setContent(code);
                redisTemplate.opsForHash().put(key, "code", dto.getContent());
                redisTemplate.opsForHash().put(key, "lastSendTime", System.currentTimeMillis());
                redisTemplate.expire(key, 10L, TimeUnit.MINUTES);
                SendEmailUtil.sendMsg(dto);
            }
        } else {
            //验证码
            redisTemplate.opsForHash().put(key, "code", dto.getContent());
            //1分钟发送一次
            redisTemplate.opsForHash().put(key, "lastSendTime", System.currentTimeMillis());
            //10分钟过期时间-》10分钟内有效
            redisTemplate.expire(key, 10L, TimeUnit.MINUTES);
            SendEmailUtil.sendMsg(dto);
        }
    }

    @Override
    public boolean validateCode(String key,String email, String code) {
        key += ":"+email;
        if(redisTemplate.hasKey(key)){
            return code.equals(redisTemplate.opsForHash().get(key,"code"));
        }
        return false;
    }
}
