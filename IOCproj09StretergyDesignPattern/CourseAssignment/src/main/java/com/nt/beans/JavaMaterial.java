package com.nt.beans;

import org.springframework.stereotype.Component;

@Component("java")
public final class JavaMaterial implements CourseMaterial{
    @Override
    public String course(){
        return "Java Course";
    }
}
