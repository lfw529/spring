package com.lfw.dao.impl;

import com.lfw.dao.BookDao;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Repository
//@Scope 设置bean的作用范围
@Scope("singleton")
public class BookDaoImpl implements BookDao {
    public void save() {
        System.out.println();
    }

    @PostConstruct
    public void init() {
        System.out.println("init ...");
    }

    //@PreDestroy设置bean的销毁方法
    @PreDestroy
    public void destroy() {
        System.out.println("destroy...");
    }
}
