package com.zhang.dao.demo;

import com.zhang.dao.UserDao;
import com.zhang.dao.service.UserService;
import com.zhang.dao.service.impl.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhanghoubing
 * @CreateDate: 2020/6/29-18:20
 */
public class UserController {
    public static void main(String[] args) {
        ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService= (UserService) app.getBean("userService");
        userService.save();
    }
}
