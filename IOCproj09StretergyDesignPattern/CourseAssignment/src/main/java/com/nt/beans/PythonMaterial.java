package com.nt.beans;

import org.springframework.stereotype.Component;

@Component("python")
public final class PythonMaterial implements CourseMaterial{
    @Override
    public String course(){
        return "Python Course ";
    }
}
