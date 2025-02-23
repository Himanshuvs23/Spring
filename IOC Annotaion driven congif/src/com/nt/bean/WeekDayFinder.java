package com.nt.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
@Component("wdf")
public class WeekDayFinder {
    private LocalDate  date;

    @Autowired
    public WeekDayFinder(LocalDate date) {
        this.date=date;
    }
    public String ShowWeekDay()  {

         int dayOfWeek=date.getDayOfWeek().getValue();
         String Day=date.getDayOfWeek().toString();

        if(dayOfWeek>=5)
             return "Today is "+Day+" So Weekend ";
         else
             return "Today  is "+Day+" So Weekday ";
    }
}
