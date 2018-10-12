package com.hello.controller;

import com.hello.entity.UserModel;
import com.hello.service.UserService;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
public class UserController {
    @Resource(name = "IuserService")    //这里的 IuserService 是 UserServiceIpml中的。
    private UserService userService;
    @RequestMapping("/test")
    public String test(){
        return "测试";
    }

//    添加
    @RequestMapping("addUser")
    public int addUser(UserModel model) {
        int re=userService.addUser(model);
        return re;
    }
    //查询
    @RequestMapping(value = "getList",method = RequestMethod.POST)
    public Object getList(){
        List list=userService.getList();
        return  list;
    }

    //按单个查询
    @RequestMapping(value = "getById" ,method = RequestMethod.GET)
    public Object getById(String id){
        Object model=userService.getById(id);
        return model;
    }

    //修改
    @RequestMapping(value = "uplateById",method = RequestMethod.POST)
    public int uplateById(UserModel model){
        int res=userService.uplateById(model);
        return res;
    }


}
