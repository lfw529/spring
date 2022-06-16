package com.lfw;

import com.lfw.service.BookService;
import com.lfw.service.impl.BookServiceImpl;

public class App {
    public static void main(String[] args) {
        BookService bookService = new BookServiceImpl();
        bookService.save();
    }
}
