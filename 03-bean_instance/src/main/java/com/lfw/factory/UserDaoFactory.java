package com.lfw.factory;

import com.lfw.dao.UserDao;
import com.lfw.dao.impl.UserDaoImpl;

//实例工厂创建对象
public class UserDaoFactory {
    public UserDao getUserDao(){
        return new UserDaoImpl();
    }
}
