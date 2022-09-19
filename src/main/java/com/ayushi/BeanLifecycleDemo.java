package com.ayushi;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifecycleDemo {

    public static void main(String[] args) {

        //load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifecycle-applicationContext.xml");

        //retrieves bean from spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);

        System.out.println(theCoach.getDailyWorkout());

        //close the context
        context.close();
    }
}
