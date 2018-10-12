package com.hello.mapper;

import com.hello.entity.UserModel;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;
import java.util.Map;

public interface UserDao {

    @Insert("INSERT INTO  `user` (  `UserName` ,  `PassWord`,`CreationTime` ) VALUES (#{UserName}, MD5(#{PassWord}),now())")
    public int addUser(UserModel model);

    @Select("SELECT * FROM `user` WHERE 1")
    public List<UserModel> getList();
//    采用这种写法就没有用到UserModel了 但是时间格式不怎么好看
//    public List<Map<String,Object>> getList();

    @Select("SELECT * FROM `user` WHERE id=#{id}")
    UserModel getById(String id);
    //    Map<String,Object> getById(String id);

    @Update("UPDATE `user` SET`UserName`=#{UserName},`CreationTime`=#{CreationTime} WHERE `Id`=#{Id}")
    int uplateById(UserModel model);

}
