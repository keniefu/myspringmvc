package com.cskaoyan.mapper;

import com.cskaoyan.bean.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author Keniefu
 * @date 2019/5/15
 */
public interface UserMapper {
    @Select("select id,username,password,email from j13_user_t where id = #{id}")
    User queryUserById(@Param("id") int id);
}
