package com.lfw.factory;

import com.lfw.dao.OrderDao;
import com.lfw.dao.impl.OrderDaoImpl;

//静态工厂创建对象
public class OrderDaoFactory {
    public static OrderDao getOrderDao() {
        System.out.println("factory setup....");
        return new OrderDaoImpl();
    }
}
