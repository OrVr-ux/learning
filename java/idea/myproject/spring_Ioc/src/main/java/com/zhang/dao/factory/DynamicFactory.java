package com.zhang.dao.factory;

import com.zhang.dao.UserDao;
import com.zhang.dao.impl.UserDaoImpl;

/**
 * @author zhanghoubing
 * @CreateDate: 2020/6/28-22:41
 */
public class DynamicFactory {
    public  UserDao getUserDao(){
        return  new UserDaoImpl();
    }
}
