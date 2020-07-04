package com.zhang.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.util.ResourceBundle;

/**
 * @author zhanghoubing
 * @CreateDate: 2020/6/30-21:11
 */
//该类是spring的核心配置类
@Configuration
//<context:component-scan base-package="com.zhang"></context:component-scan>
@ComponentScan("com.zhang")
//<context:property-placeholder location="classpath:jdbc.properties"/>
//@PropertySource("classpath:jdbc.properties")
//<import resource=""/>
//@Import(DataSourceConfiguration.class) //一个文件
@Import({DataSourceConfiguration.class}) //多个文件
public class SpringConfiguration {



}
