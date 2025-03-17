package com.nt.main;

import com.nt.beans.Student;
import com.nt.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StretargyTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        Student student = ctx.getBean("student",Student.class);
//        student.StudentCourse("Himanshu");
    System.out.println( student.StudentCourse("Himanshu"));
    }
}
