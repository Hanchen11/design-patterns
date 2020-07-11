package com.learn.design.designpatterns.core;

import com.learn.design.designpatterns.dao.DataSourceConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan
@Import(DataSourceConfiguration.class)
public class DesignPatternsCoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(DesignPatternsCoreApplication.class, args);
    }

}
