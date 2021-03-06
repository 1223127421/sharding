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
public interface UserDao {

    @Insert("insert into sys_user values(#{name})")
    int insertUser(@Param("name") String name);

    @Insert("insert into sys_dict(id,name) values(#{id},#{name})")
    int insertDict(@Param("id")Integer id,@Param("name") String name);

    @Select("select * from sys_dict")
    List<Map> listDict();
}
