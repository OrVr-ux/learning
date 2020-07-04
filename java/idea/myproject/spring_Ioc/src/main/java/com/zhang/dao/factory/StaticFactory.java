package com.zhang.dao.factory;

import com.zhang.dao.UserDao;
import com.zhang.dao.impl.UserDaoImpl;

/**
 * @author zhanghoubing
 * @CreateDate: 2020/6/28-22:35
 */
public class StaticFactory {
    public  static UserDao getUserDao(){
        return  new UserDaoImpl();
    }
}
