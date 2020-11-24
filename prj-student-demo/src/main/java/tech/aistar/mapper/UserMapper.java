package tech.aistar.mapper;

import org.apache.ibatis.annotations.Select;
import tech.aistar.entity.User;

import java.util.List;

public interface UserMapper {
    @Select("select * from user")
    List<User> findAll();

    @Select("select * from user where email=#{value}")
    User findByEmail(String email);
}
