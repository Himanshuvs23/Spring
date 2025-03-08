package com.nt.main;

import com.nt.beans.Appconfig;
import com.nt.config.Flipkart;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class test {
    public static void main (String [] args){

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Appconfig.class);
        Flipkart fpkt = ctx.getBean("fpkt", Flipkart.class);
        String msg = fpkt.Shopping(new String[]{"shirt","pant","colour"},new double[]{6000.0,8000.0});
        System.out.println(msg);
    }
}
