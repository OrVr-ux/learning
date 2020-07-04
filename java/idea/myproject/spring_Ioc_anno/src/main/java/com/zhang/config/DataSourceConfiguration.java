package com.zhang.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.util.ResourceBundle;

/**
 * @author zhanghoubing
 * @CreateDate: 2020/6/30-21:25
 */
@PropertySource("classpath:jdbc.properties")
public class DataSourceConfiguration {

    @Value("${jdbc.driver}")
    private  String driver;
    @Value("${jdbc.url}")
    private  String url;
    @Value("${jdbc.user}")
    private  String user;
    @Value("${jdbc.password}")
    private  String password;

    @Bean("dataSource")
    public DataSource getDataSource() throws Exception {
        ResourceBundle rb=ResourceBundle.getBundle("jdbc");
        ComboPooledDataSource dataSource=new ComboPooledDataSource();
        dataSource.setDriverClass(driver);
        dataSource.setJdbcUrl(url);
        dataSource.setUser(user);
        dataSource.setPassword(password);
        Connection connection=dataSource.getConnection();
        System.out.println(connection);
        connection.close();
        return  dataSource;
    }
}
