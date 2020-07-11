package com.learn.design.designpatterns.api.request;

import lombok.Data;

import java.io.Serializable;

@Data
public class TeacherRequest implements Serializable {

    private Long id;
}
