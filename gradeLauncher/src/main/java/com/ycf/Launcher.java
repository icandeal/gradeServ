package com.ycf;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sun.applet.Main;

/**
 * Created by sniper on 16-8-12.
 */
public class Launcher {

    public static void main(String []args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/applicationContext.xml");

        System.out.println("context start !!");
        Integer count = ((GradeAPIImpl)context.getBean("gradeAPIImpl")).getGradeCount();
        Main.main(null);
    }
}
