package com.zhang.test;

import com.zhang.dao.UserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhanghoubing
 * @CreateDate: 2020/6/28-22:06
 */
public class SpringTest {
    @Test
    //测试scope
    public  void  test1(){
        ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao1= (UserDao) app.getBean("userDao");
        UserDao userDao2= (UserDao) app.getBean("userDao");
        userDao1.save();
        System.out.println(userDao2);
    }
}
