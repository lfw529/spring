package com.lfw.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//通知类必须配置成Spring管理的bean
@Component
//设置当前类为切面类
@Aspect
public class MyAdvice {
    //设置切入点，要求配置在方法上面
    @Pointcut("execution(void com.lfw.dao.BookDao.update())")
    private void pt() {
    }

    //设置在切入点pt()的前面运行当前操作(前置通知)
    @Before("pt()")
    public void method() {
        System.out.println(System.currentTimeMillis());
    }
}
