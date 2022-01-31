package cn.com.mall.mapper;

import cn.com.mall.entity.UmsMember;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UmsMemberMapper {
    @Select("select * from leyoumall.ums_member where id=#{userId} and `status`=1")
    UmsMember getById(@Param("userId") Long userId);
}