package com.zhang;

import com.zhang.service.UserService;
import com.zhang.web.UserController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * @author zhanghoubing
 * @CreateDate: 2020/7/1-18:03
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class SpringJunitTest {
    @Autowired
    private UserController userController;
    @Autowired
    private UserService userService;
    @Autowired
    private  DataSource dataSource;


    @Test
    public  void test(){
        userController.save();
    }

    @Test
    public  void  test1() throws SQLException {
        userService.save();
        System.out.println(dataSource.getConnection());
    }
}
