package com.example.design.mapper;

import com.example.design.model.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by lxh on 4/14/16.
 */
@Component
public interface UserMapper {
    @Select("SELECT COUNT(*) FROM `user` WHERE `name`=#{name} AND `password`=#{password}")
    int count(@Param("name") String name, @Param("password") String password);

    @Select("SELECT * FROM `user`")
    List<User> all();

    @Insert("INSERT INTO `user` () VALUES ()")
    int add(User user);

    @Update("UPDATE `user` () VALUES() WHERE `id`=#{id}")
    int update(User user);

    @Select("")
    List<User> selectByName(@Param("name") String name);

    @Select("")
    List<User> selectByPhone(@Param("phone") String phone);

    @Delete("DELETE FROM `user` WHERE `id`=#{id}")
    int delete(int id);

    @Delete("DELETE FROM `user` WHERE `id`=#{id}")
    int deleteByPhone(@Param("phone") String phone);
}
