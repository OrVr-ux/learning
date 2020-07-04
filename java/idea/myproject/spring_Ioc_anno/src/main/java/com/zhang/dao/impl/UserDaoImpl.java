package com.zhang.dao.impl;

import com.zhang.dao.UserDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author zhanghoubing
 * @CreateDate: 2020/6/30-20:20
 */
//<bean id="userDao" class="com.zhang.dao.impl.UserDaoImpl"></bean>
//@Component("userDao")
@Repository("userDao")
public class UserDaoImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("save Running...");
    }
    @PostConstruct
    public  void init(){
        System.out.println("初始化......");
    }
    @PreDestroy
    public  void destory(){
        System.out.println("销毁...");
    }
}
