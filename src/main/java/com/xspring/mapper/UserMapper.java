package com.xspring.mapper;

import com.xspring.pojo.User;
import java.util.List;

public interface UserMapper {
    //增加
    int insertUser(User user);
    //删除
    int deleteUser(Integer id);
    //修改
    int updateUser(User user);
    //查询
    User getUserById(Integer id);
    //查询所有
    List<User> getAllUser();
}
