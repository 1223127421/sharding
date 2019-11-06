package com.wang.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Mapper
@Component
public interface UserDao {

    @Insert("insert into sys_user(name) values(#{name})")
    int insertUser(@Param("name") String name);

    @Select("select * from sys_user")
    List<Map> listUser();
}
