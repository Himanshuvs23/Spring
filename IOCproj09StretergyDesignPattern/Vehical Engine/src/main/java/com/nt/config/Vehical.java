package com.nt.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.naming.spi.StateFactory;

@Component("vehical")
public final class Vehical {
    @Autowired
    @Qualifier("PEngg")
    private Engine engine;

    public String journey(String start,String end){

        return "journey stated from :"+start+"----Ended to "+end;

    }


}
