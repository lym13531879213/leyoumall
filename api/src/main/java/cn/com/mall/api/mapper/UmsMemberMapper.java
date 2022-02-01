package cn.com.mall.api.mapper;

import cn.com.mall.entity.UmsMember;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UmsMemberMapper {
    @Select("select * from leyoumall.ums_member where id=#{userId} and `status`=1")
    UmsMember getById(@Param("userId") Long userId);

    boolean register(UmsMember user);

    @Select("select * from leyoumall.ums_member where email = #{email} and `status` = 1")
    UmsMember getUserByEmail(@Param("email") String email);

    boolean forgetPwd(@Param("userId") Long userId, @Param("salt") String salt, @Param("pwd") String pwd);
}