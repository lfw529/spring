package com.lfw.service.impl;

import com.lfw.dao.BookDao;
import com.lfw.service.BookService;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BookServiceImpl implements BookService, InitializingBean, DisposableBean {
    private BookDao bookDao;

    public void setBookDao(BookDao bookDao) {
        System.out.println("set ......");
        this.bookDao = bookDao;
    }

    public void save() {
        System.out.println("book service save ...");
        bookDao.save();
    }

    public void destroy() {
        System.out.println("service destroy");
    }

    public void afterPropertiesSet() {
        System.out.println("service init");
    }
}
