package com.cskaoyan.config;

import org.apache.tomcat.dbcp.dbcp.BasicDataSourceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.Properties;

@Configuration
@ComponentScan(basePackages = "com.cskaoyan")
public class MyConfig {

    @Bean
    public DataSource dataSource() throws Exception {
        Properties properties = new Properties();
        properties.setProperty("driverClassName", "com.mysql.cj.jdbc.Driver");
        properties.setProperty("url", "jdbc:mysql://localhost:3306/j13_jdbc_template?serverTimezone=GMT&useSSL=false");
        properties.setProperty("username", "root");
        properties.setProperty("password", "123456");
        DataSource dataSource = BasicDataSourceFactory.createDataSource(properties);
        return dataSource;
    }

}
