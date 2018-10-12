package com.hello.service;

import com.hello.entity.UserModel;

import java.util.List;
import java.util.Map;

public interface UserService {
    //添加
    public int addUser(UserModel model) ;

    List getList();

    Object getById(String id);

    int uplateById(UserModel model);
}
