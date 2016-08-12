package com.ycf;

import com.alibaba.dubbo.container.Main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by sniper on 16-8-12.
 */
public class Launcher {

    public static void main(String []args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/applicationContext.xml");

        System.out.println("context start !!");
        Integer count = ((GradeAPIImpl)context.getBean("gradeAPIImpl")).getGradeCount();
        System.out.println("count is : "+count);
        Main.main(null);
    }
}
