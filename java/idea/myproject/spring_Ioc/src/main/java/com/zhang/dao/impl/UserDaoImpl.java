package com.zhang.dao.impl;

import com.zhang.dao.UserDao;
import com.zhang.dao.domain.User;

import java.util.ArrayList;
import java.util.Map;
import java.util.Properties;

/**
 * @author zhanghoubing
 * @CreateDate: 2020/6/28-21:34
 */
public class UserDaoImpl  implements UserDao {
    private  String userName;
    private int age;

    private ArrayList list;
    private Map<String, User> userMap;
    private Properties properties;

    public ArrayList getList() {
        return list;
    }

    public void setList(ArrayList list) {
        this.list = list;
    }

    public Map<String, User> getUserMap() {
        return userMap;
    }

    public void setUserMap(Map<String, User> userMap) {
        this.userMap = userMap;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public UserDaoImpl() {
        System.out.println("UserDaoImpl创建...");
    }

    public  void init(){
        System.out.println("初始化......");
    }

    public  void destory(){
        System.out.println("销毁......");
    }
    @Override
    public void save() {
       // System.out.println(userName+"========"+age);
        System.out.println(list);
        System.out.println(userMap);
        System.out.println(properties);
        System.out.println("save running......");
    }
}
