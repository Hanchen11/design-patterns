package com.learn.design.designpatterns.core.service;

import com.learn.design.designpatterns.dao.domain.TeacherBean;
import com.learn.design.designpatterns.dao.mapper.TeacherMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TeacherService {
    /**
     * 注入服务
     */
    @Resource
    private TeacherMapper teacherMapper;

    public TeacherBean queryTeacher(Long id) {
        return teacherMapper.getTeacherById(id);
    }

}
