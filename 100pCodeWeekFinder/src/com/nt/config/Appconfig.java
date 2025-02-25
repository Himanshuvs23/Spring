package com.nt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;

@Configuration

@ComponentScan(basePackages = "com.nt.bean")

public class Appconfig {
    @Bean(name="ldate")
    public LocalDate createDate(){
        return LocalDate.now();
    }
}
