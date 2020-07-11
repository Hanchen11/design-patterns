package com.learn.design.designpatterns.dao.mapper;

import com.learn.design.designpatterns.dao.domain.TeacherBean;
import org.apache.ibatis.annotations.Param;

public interface TeacherMapper {

    /**
     * 通过id查询老师信息
     * @param id id
     * @return teacher信息
     */
    TeacherBean getTeacherById(@Param("id") Long id);
}
