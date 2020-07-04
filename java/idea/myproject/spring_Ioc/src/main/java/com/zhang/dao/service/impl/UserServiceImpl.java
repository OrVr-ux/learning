package com.zhang.dao.service.impl;

import com.zhang.dao.UserDao;
import com.zhang.dao.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhanghoubing
 * @CreateDate: 2020/6/29-18:18
 */
public class UserServiceImpl  implements UserService {
    private  UserDao userDao;

    public UserServiceImpl() {
    }
//    public void setUserDao(UserDao userDao) {
//        this.userDao = userDao;
//    }


    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    public void save() {
        userDao.save();
    }
}
