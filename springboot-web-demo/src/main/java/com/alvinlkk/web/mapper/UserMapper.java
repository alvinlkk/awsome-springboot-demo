package com.alvinlkk.web.mapper;

import com.alvinlkk.web.pojo.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author alvinkk
 * @create 2018-05-10 15:35
 **/
public interface UserMapper {

    @Select("select * from user")
    List<User> getAll();
}
