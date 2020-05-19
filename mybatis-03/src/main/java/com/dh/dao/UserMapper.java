package com.dh.dao;


import com.dh.pojo.User;

import java.util.List;
import java.util.Map;


public interface UserMapper {
    List<User> getUserList();
    User getUserById(int id);
//    分页查询
    List<User> getUserByLimit(Map<String,Integer> map);
}
