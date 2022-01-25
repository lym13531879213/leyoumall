package cn.com.mall.mapper;

import cn.com.mall.entity.OperateUser;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface OperateUserMapper {
    @Select("select * from leyoumall.operate_user where user_id = #{operatorId} and deleted = 0 ")
    OperateUser getById(@Param("operatorId") Long operatorId);

    @Select("select * from leyoumall.operate_user where username = #{username} and deleted = 0")
    OperateUser getByUsername(@Param("username") String username);

    boolean createOperator(OperateUser operateUser);

    List<OperateUser> getList(@Param("operatorId") Long operatorId, @Param("realName") String realName,
                              @Param("mobile") String mobile, @Param("status") Integer status);

    @Update("update leyoumall.operate_user set `status` = #{status},update_time = now() where user_id=#{operatorId}")
    boolean switchStatus(@Param("operatorId") Long operatorId, @Param("status") Integer status);

    @Update("update leyoumall.operate_user set deleted = 1,update_time = now() where user_id=#{operatorId}")
    boolean deleteUser(@Param("operatorId") Long operatorId);

    boolean modifyOperator(@Param("operatorId") Long operatorId, @Param("email") String email, @Param("headImg") String headImg,
                           @Param("mobile") String mobile, @Param("realName") String realName, @Param("username") String username);
}