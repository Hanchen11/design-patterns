package com.learn.design.designpatterns.api;

import com.learn.design.designpatterns.core.service.TeacherService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class DesignPatternsApiApplicationTests {

    @Resource
    private TeacherService teacherService;

    @Test
    void contextLoads() {
        System.out.println(teacherService.queryTeacher(1L));
    }

}
