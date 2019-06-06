package com.lwt.rabbitmq.rabbitmqconsumer.dto;

import java.io.Serializable;

/**
 * user对象
 */
public class UserDto implements Serializable {
    private int id;
    private String userName;
    private String passWord;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getpassWord() {
        return passWord;
    }

    public void setPassword(String passWord) {
        this.passWord = passWord;
    }

    public UserDto(){}

    public UserDto(int id,String userName,String passWord){
        this.userName = userName;
        this.id = id;
        this.passWord = passWord;
    }

    @Override
    public String toString() {
        return "id-->"+this.id+";userName-->"+this.userName+";passWord-->"+this.passWord;
    }
}
