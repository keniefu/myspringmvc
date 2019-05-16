package com.cskaoyan.config;

import org.apache.tomcat.dbcp.dbcp.BasicDataSourceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.Properties;

@Configuration
@ComponentScan(basePackages = "com.cskaoyan")
@EnableTransactionManagement
public class MyConfig {

    @Bean
    public DataSource dataSource() throws Exception {
//        BasicDataSourceFactory basicDataSourceFactory = new BasicDataSourceFactory();
        Properties properties = new Properties();
        properties.setProperty("driverClassName", "com.mysql.cj.jdbc.Driver");
        properties.setProperty("url", "jdbc:mysql://localhost:3306/j13_jdbc_template?serverTimezone=GMT&useSSL=false");
        properties.setProperty("username", "root");
        properties.setProperty("password", "123456");
        DataSource dataSource = BasicDataSourceFactory.createDataSource(properties);
        return dataSource;
//        BasicDataSource basicDataSource = new BasicDataSource();
//        basicDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
//        basicDataSource.setUrl("jdbc:mysql://localhost:3306/j13_jdbc_template?serverTimezone=GMT&useSSL=false");
//        basicDataSource.setUsername("root");
//        basicDataSource.setPassword("123456");
//        return basicDataSource;
    }

    @Bean
    public DataSourceTransactionManager txManager(DataSource dataSource) {
        DataSourceTransactionManager dataSourceTransactionManager = new DataSourceTransactionManager();
        dataSourceTransactionManager.setDataSource(dataSource);
        return dataSourceTransactionManager;
    }
}
