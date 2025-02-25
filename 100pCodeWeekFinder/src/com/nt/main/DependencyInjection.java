package com.nt.main;

import com.nt.bean.WeekDayFinder;
import com.nt.config.Appconfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DependencyInjection {



    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Appconfig.class);

        Object obj = context.getBean("wdf");
        WeekDayFinder finder = (WeekDayFinder) obj;
        String msg = finder.showWeekDays("Raja");
        System.out.println(msg);
                context.close();
    }
}