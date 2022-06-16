package com.lfw.service.impl;

import com.lfw.dao.BookDao;
import com.lfw.service.BookService;
import org.springframework.stereotype.Service;

//@Component定义bean
//@Component
//@Service：@Component衍生注解
@Service
public class BookServiceImpl implements BookService {
    private BookDao bookDao;

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public void save() {
        System.out.println("book service save ...");
        bookDao.save();
    }
}
