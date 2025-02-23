package com.nt.main;

import com.nt.bean.WeekDayFinder;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class dependencyInjection {
    public static void main(String[] args) {
        FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
        WeekDayFinder WeekFind = context.getBean("wdf", WeekDayFinder.class);
        String result = WeekFind.ShowWeekDay();
        System.out.println(result);
    }
}
