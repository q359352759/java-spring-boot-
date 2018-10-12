package com.hello.service.inpl;

import com.hello.entity.UserModel;
import com.hello.mapper.UserDao;
import com.hello.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service("IuserService")
public class UserServiceImpl implements UserService {

//    这里注释的注解 HelloApplication 需要添加MapperScan
    @Resource
    private UserDao userDao;

    @Override
    public int addUser(UserModel model){
        try {
            return userDao.addUser(model);
        }catch (Exception e){
            e.printStackTrace();
            return 0;
        }
    }

    @Override
    public List getList() {
        List map=userDao.getList();
//        return userDao.getList();
        return  map;
    }


    @Override
    public Object getById(String id) {
//        return userDao.getById(id);
        return userDao.getById(id);
    }

    @Override
    public int uplateById(UserModel model) {

        return userDao.uplateById(model);
    }


}
