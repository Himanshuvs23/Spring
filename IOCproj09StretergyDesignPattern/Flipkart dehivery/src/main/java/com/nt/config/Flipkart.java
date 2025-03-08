package com.nt.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Random;
@Component("fpkt")
public final class Flipkart {
    @Autowired
    @Qualifier("BDart")
    private Courier courier;

    public String Shopping (String items[],double prices[]){
        double billAmount = 0.0;
        for(double p : prices){
            billAmount=billAmount+ p;
        }
        int oid = new Random().nextInt(1000);
        String msg = courier.delivery(oid);
        return Arrays.toString(items)+"items with billAoumt of " +billAmount+"---"+msg;
    }

}
