 package com.nt.main;

 import com.nt.sbeans.SeasonFinder;
 import org.springframework.context.support.FileSystemXmlApplicationContext;

 public class DependencyInjectionTest {
    public static void main(String[] args) {
        FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
       SeasonFinder find = context.getBean("SF", SeasonFinder.class);
       String res = find.FinderSeason();
       System.out.println(res);

    }
}
