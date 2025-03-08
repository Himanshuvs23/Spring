package com.nt.main;

import com.nt.beans.AppConfig;
import com.nt.config.Vehical;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        Vehical vehical = ctx.getBean("vehical",Vehical.class);
       String msg =  vehical.journey("Hyderabad","Goa");
        System.out.println(msg);
    }
}
