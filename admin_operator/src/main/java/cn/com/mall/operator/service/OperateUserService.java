package cn.com.mall.operator.service;

import cn.com.mall.entity.OperateUser;
import cn.com.mall.operator.pojo.dto.operator.ModifyOperatorDTO;

import java.util.List;

/**
 *
 */
public interface OperateUserService {

    /**
     * 【根据id获取运营用户】
     *
     * @param operatorId 运营用户Id
     * @return 运营用户信息
     */
    OperateUser getById(Long operatorId);

    /**
     * 【根据username获取运营用户】
     *
     * @param username 用户名
     * @return 运营用户信息
     */
    OperateUser getByUsername(String username);

    /**
     * 【创建运营用户】
     *
     * @param operatorId  创建者
     * @param operateUser 运营用户对象
     * @return true: 成功   false: 失败
     */
    boolean createOperator(Long operatorId, OperateUser operateUser);

    /**
     * 【登录】
     *
     * @param username 用户名
     * @param password 密码
     * @return token
     */
    String login(String username, String password);

    List<OperateUser> getPage(Object page, Long operatorId, String realName, String mobile, Integer status);

    boolean switchStatus(Long operatorId, Integer status);

    boolean deleteUser(Long operatorId);

    boolean modifyOperator(Long operatorId, ModifyOperatorDTO dto);
}
