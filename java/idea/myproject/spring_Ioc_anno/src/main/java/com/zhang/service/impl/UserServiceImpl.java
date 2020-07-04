package com.zhang.service.impl;

import com.zhang.dao.UserDao;
import com.zhang.dao.impl.UserDaoImpl;
import com.zhang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author zhanghoubing
 * @CreateDate: 2020/6/30-20:22
 */
//@Component("userService")
@Service("userService")
@Scope("singleton")
public class UserServiceImpl implements UserService {
//    @Autowired //按照数据类型从spring容器中匹配
//    @Qualifier("userDao") //是按照id从容器中匹配，但是主要此处Qualifier结合@Autowired使用
    @Resource(name = "userDao") //相当于@Autowired+@Qualifier("userDao")
    private UserDao userDao;

    //@Value("itCast")
    @Value("${jdbc.driver}")
    private  String driver; //普通值注入


    @Override
    public void save() {
        userDao.save();
        System.out.println(driver);
    }




}
