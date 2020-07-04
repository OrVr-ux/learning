package com.zhang;

import com.alibaba.druid.pool.DruidDataSource;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.util.ResourceBundle;

/**
 * @author zhanghoubing
 * @CreateDate: 2020/6/29-22:25
 */
public class TestDatasource {
    /**
     * *
     *c3p0数据源
     */
    @Test
    public  void  test1() throws Exception {
        ComboPooledDataSource dataSource=new ComboPooledDataSource();
        dataSource.setDriverClass("com.mysql.jdbc.Driver");
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/test");
        dataSource.setUser("root");
        dataSource.setPassword("root");
        Connection connection=dataSource.getConnection();
        System.out.println(connection);
        connection.close();
    }

    /**
     * *
     *c3p0数据源
     */
    @Test
    public  void  test3() throws Exception {
        ResourceBundle rb=ResourceBundle.getBundle("jdbc");
        ComboPooledDataSource dataSource=new ComboPooledDataSource();
        String driver=rb.getString("jdbc.driver");
        String jdbcUrl=rb.getString("jdbc.url");
        String user=rb.getString("jdbc.user");
        String password=rb.getString("jdbc.password");
        dataSource.setDriverClass(driver);
        dataSource.setJdbcUrl(jdbcUrl);
        dataSource.setUser(user);
        dataSource.setPassword(password);
        Connection connection=dataSource.getConnection();
        System.out.println(connection);
        connection.close();
    }

    /**
     *
      * druild数据源
     */
    @Test
    public  void  test2() throws Exception {
        DruidDataSource dataSource=new DruidDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/test");
        dataSource.setUsername("root");
        dataSource.setPassword("root");
        Connection connection=dataSource.getConnection();
        System.out.println(connection);
        connection.close();
    }

    /**
     *
     * spring容器产生数据源 c3p0
     */
    @Test
    public  void  test4() throws Exception {
        ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
        DataSource dataSource = (DataSource) app.getBean("dataSource");
        Connection connection=dataSource.getConnection();
        System.out.println(connection);
        connection.close();
    }

    /**
     *
     * spring容器产生数据源 Druid
     */
    @Test
    public  void  test5() throws Exception {
        ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
        DataSource dataSource = (DataSource) app.getBean("dataSource1");
        Connection connection=dataSource.getConnection();
        System.out.println(connection);
        connection.close();
    }

    /**
     *
     * spring容器产生数据源 c3p0(jdbc.properties配置数据源)
     */
    @Test
    public  void  test6() throws Exception {
        ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
        DataSource dataSource = (DataSource) app.getBean("dataSource2");
        Connection connection=dataSource.getConnection();
        System.out.println(connection);
        connection.close();
    }

    /**
     *
     * spring容器产生数据源 Druid(jdbc.properties配置数据源)
     */
    @Test
    public  void  test7() throws Exception {
        ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
        DataSource dataSource = (DataSource) app.getBean("dataSource3");
        Connection connection=dataSource.getConnection();
        System.out.println(connection);
        connection.close();
    }

}
