package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.time.LocalDate;

public class SeasonFinder {
    private LocalDate date;

   public SeasonFinder(LocalDate date) {
       this.date=date;
    }
    public String FinderSeason(){
        int month = date.getMonthValue();

        if(month>=4&&month<=6)
            return "Summer";
        else if (month>=7&&month<=9)
            return "Autumn";
        else return "Winter";

    }
}
