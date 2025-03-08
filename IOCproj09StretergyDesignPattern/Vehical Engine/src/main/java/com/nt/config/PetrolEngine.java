package com.nt.config;

import org.springframework.stereotype.Component;

@Component("PEngg")
public final class PetrolEngine implements Engine{
    @Override
    public void startEngine(){
        System.out.println("PetrolEngine.startEngine");
    }
    @Override
    public void stopEngine(){
        System.out.println("PetrolEngine.stopEngine");
    }
}
