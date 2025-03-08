package com.nt.config;

import org.springframework.stereotype.Component;

@Component("DEngg")
public class DesialEngine implements Engine{
    public void startEngine(){
        System.out.println("DesialEngine.startEngine");
    }
    public void stopEngine(){
        System.out.println("DesialEngine.stopEngine");
    }
}
