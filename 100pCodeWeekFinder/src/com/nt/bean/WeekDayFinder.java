package com.nt.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component("wdf")
public class WeekDayFinder {
//field injecton


  @Autowired
    private LocalDate date;

    public String showWeekDays(String user) {
        int weekday = date.getDayOfWeek().getValue();

        if(weekday>=1 && weekday<=5)
            return "Work hard bother "+user;
        else {
            return "Enjoy Your day "+user;
        }
    }
}
