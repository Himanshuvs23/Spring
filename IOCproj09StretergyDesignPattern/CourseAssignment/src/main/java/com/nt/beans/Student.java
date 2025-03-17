package com.nt.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("student")
public final class Student {
    @Autowired
    @Qualifier("java")
    private CourseMaterial courseMaterial;
    //b.method
    public String StudentCourse(String user){

        return user+" Select the course of ---->"+courseMaterial.course();
    }
}
