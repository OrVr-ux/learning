package com.zhang.web;

import com.zhang.config.SpringConfiguration;
import com.zhang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

/**
 * @author zhanghoubing
 * @CreateDate: 2020/6/30-20:27
 */
@Controller
public class UserController {
    @Autowired
    private  UserService userService;
    public void save() {
        //ClassPathXmlApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
//        ApplicationContext app=new AnnotationConfigApplicationContext(SpringConfiguration.class);
//        UserService userService= (UserService) app.getBean("userService");
        userService.save();


    }

}
