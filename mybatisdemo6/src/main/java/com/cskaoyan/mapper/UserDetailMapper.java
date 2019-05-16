package com.cskaoyan.mapper;

import com.cskaoyan.bean.UserDetail;
import org.apache.ibatis.annotations.Param;

/**
 * @author Keniefu
 * @date 2019/5/14
 */
public interface UserDetailMapper {
    /**
     * 通过uid查询得到userDetail
     * @param id 需要查询的user的uid
     * @return 该uid所对应的UserDetail的具体对象
     */
    UserDetail queryUserDetailById(@Param("id") int id);
}
