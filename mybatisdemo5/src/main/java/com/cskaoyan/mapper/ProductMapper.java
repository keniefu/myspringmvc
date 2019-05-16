package com.cskaoyan.mapper;

import com.cskaoyan.bean.PageHelper;
import com.cskaoyan.bean.Product;
import com.cskaoyan.bean.ProductSearchCriteria;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Keniefu
 * @date 2019/5/13
 */
public interface ProductMapper {
    /**
     * 通过查询条件查询商品
     * @param productSearchCriteria  查询商品的条件，有id，name模糊查询，价格区间，cid品类，可以为空，空就是没有这个条件
     * @return 所有符合上述条件的product
     */
    List<Product> queryProductByCriteria(@Param("pro") ProductSearchCriteria productSearchCriteria);

    /**
     * 通过helper中的id属性查出pageHelper
     * @param id pageHelper的id值
     * @return 加入所有商品的helper对象
     */
    PageHelper queryProductThroughPageHelper(@Param("id")int id);

    /**
     * 查出数据库中所有pageHelper
     * @return 加入所有helper对象
     */
    PageHelper[] queryProductThroughAllPageHelper();
}
