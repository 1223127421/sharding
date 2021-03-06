package com.wang.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

@Mapper
@Component
public interface OrderDao {

//    @Insert("insert into t_order_ values(#{orderId},#{price},#{userId},#{status})")
//    int insertOrder(@Param("orderId") Long orderId,@Param("price") BigDecimal price, @Param("userId") Long userId, @Param("status") String status);

    @Insert("insert into t_order_ values(#{price},#{userId},#{status})")
    int insertOrder(@Param("price") BigDecimal price, @Param("userId") Long userId, @Param("status") String status);

    @Select("select order_id,price,user_id from t_order_ order by user_id")
    List<Map> list();

}
