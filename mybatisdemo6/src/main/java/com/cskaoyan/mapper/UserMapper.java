package com.cskaoyan.mapper;

import com.cskaoyan.bean.User;
import org.apache.ibatis.annotations.Param;

/**
 * @author Keniefu
 * @date 2019/5/13
 */
public interface UserMapper {
    /**
     * 通过user的id查询user对象
     * @param id 需要查询user的id
     * @return 该id所对应的user的对象
     */
    User queryUserById(@Param("id") int id);
}
