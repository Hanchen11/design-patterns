package com.learn.design.designpatterns.api.controller;


import com.learn.design.designpatterns.api.request.TeacherRequest;
import com.learn.design.designpatterns.core.service.TeacherService;
import com.learn.design.designpatterns.dao.domain.TeacherBean;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TeacherController {

    /**
     * 注入服务
     */
    @Resource
    private TeacherService teacherService;

    /**
     * 查询老师信息
     *
     * @param
     * @return 信息
     */
    @RequestMapping(value = "/teacher", method = RequestMethod.POST)
    public TeacherBean getTeacherMessage(@RequestBody TeacherRequest request) {
        return teacherService.queryTeacher(request.getId());
    }
}
