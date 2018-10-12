package com.hello.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserModel {
    @JsonProperty("Id")     //这个主要是避免首字母自动转换大小写的问题
    private int Id;
    @JsonProperty("UserName")
    private String UserName;
    @JsonProperty("PassWord")
    private String PassWord;
    @JsonProperty("CreationTime")
    private String CreationTime=null;       //设置默认值，感觉没用到

    @JsonProperty("Id")
    public int getId() {
        return Id;
    }
    public void setId(int Id) {
        this.Id = Id;
    }

    @JsonProperty("UserName")
    public String getUserName() {
        return UserName;
    }
    public void setUserName(String userName) {
        UserName = userName;
    }

    @JsonProperty("PassWord")
    public String getPassWord() {
        return PassWord;
    }
    public void setPassWord(String passWord) {
        PassWord = passWord;
    }

    @JsonProperty("CreationTime")
    public String getCreationTime() {
        return CreationTime;
    }
    public void setCreationTime(String creationTime) {
        if(creationTime.equals("")){
            CreationTime = null;
        }else{
            CreationTime = creationTime;
        }

    }
}
