package com.cskaoyan.mapper;

import com.cskaoyan.bean.Order;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * @author Keniefu
 * @date 2019/5/11
 */
public interface OrderMapper {
    /**
     * 通过uid查询所有该用户的订单
     * @param uid 用户id
     * @return 返回该用户的所有订单条目
     */
    List<Order> queryOrderByUid(@Param("uid") int uid);

    /**
     * 加入新订单到数据库中
     * @param order 要加入数据库的新订单
     * @return 0或1，1表示加入成功，0表示加入失败
     */
    int insertOrder(Order order);

    /**
     * 通过订单状态查询订单
     * @param state 要查询的订单状态
     * @return 所有符合该状态的订单
     */
    List<Order> queryOrderByState(@Param("state") int state);

    /**
     * 通过价格区间查询订单
     * @param topMoney 价格区间的上限
     * @param bottleMoney 价格区间的下限
     * @return 在价格区间内的order
     */
    List<Order> queryOrderByMoneyRange(@Param("topMoney") double topMoney,@Param("bottleMoney") double bottleMoney);


    /**
     * 通过时间区间查询订单
     * @param preTime 时间区间的起点
     * @param postTime 时间区间的终点
     * @return 在时间区间内的order
     */
    List<Order> queryOrderByTimeRange(@Param("preTime")Date preTime, @Param("postTime") Date postTime);
}
