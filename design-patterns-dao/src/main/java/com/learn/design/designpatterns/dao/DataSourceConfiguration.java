package com.learn.design.designpatterns.dao;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.jdbc.datasource.DriverManagerDataSource;


/**
 * Group Mapper模块配置类.
 *
 * @author yuehua
 * @since 0.0.1
 */
@Configuration
@MapperScan(basePackages = "com.learn.design.designpatterns.dao")
public class DataSourceConfiguration {

    /**
     * url
     */
    @Value("${spring.datasource.url}")
    private String url;

    /**
     * 驱动名称
     */
    @Value("${spring.datasource.driverClassName}")
    private String driverClassName;

    /**
     * 数据库名
     */
    @Value("${spring.datasource.username}")
    private String username;

    /**
     * 数据库密码
     */
    @Value("${spring.datasource.password}")
    private String password;


    @Bean(name = "dataSource")
    public DriverManagerDataSource dataSource(){
        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
        driverManagerDataSource.setUrl(url);
        driverManagerDataSource.setUsername(username);
        driverManagerDataSource.setPassword(password);
        driverManagerDataSource.setDriverClassName(driverClassName);
        return driverManagerDataSource;
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer placeholderConfigurer() {
        PropertySourcesPlaceholderConfigurer c = new PropertySourcesPlaceholderConfigurer();
        c.setIgnoreUnresolvablePlaceholders(true);
        return c;
    }
}