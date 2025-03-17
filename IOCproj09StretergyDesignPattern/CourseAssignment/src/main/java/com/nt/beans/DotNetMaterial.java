package com.nt.beans;

import org.springframework.stereotype.Component;

@Component("dotnet")
public final class DotNetMaterial implements CourseMaterial{
    @Override
    public String course(){
        return "Dotnet Course";
    }
}
