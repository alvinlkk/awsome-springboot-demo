package com.alvinlkk.tx.mapper;

import com.alvinlkk.tx.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @author alvinkk
 * @create 2018-05-10 15:35
 **/
public interface UserMapper {

    @Select("select * from user")
    List<User> getAll();

    @Insert("insert into user (user_name, password, age) values(#{userName}, #{password}, #{age})")
    void insert(User user);

    @Select("select * from user where user_name = #{userName} limit 0, 1")
    User getByUserName(@Param("userName") String userName);

    @Update("update user set password=#{password}, age=#{age} where user_name = #{userName}")
    void updateUser(User user);

    @Select("select * from user where user_name = #{userName}")
    List<User> listByUserName(@Param("userName") String userName);
}
