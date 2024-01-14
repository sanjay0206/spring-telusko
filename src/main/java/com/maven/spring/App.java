package com.maven.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
//        Vehicle obj = new Bike();
//        obj.drive();
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        String[] beanNames = context.getBeanDefinitionNames();
        for (String beanName : beanNames) {
            System.out.println("Bean Name: " + beanName);
            System.out.println("Bean Type: " + context.getType(beanName));
            System.out.println("--------------------------------------");
        }
        Vehicle bikeObj = (Vehicle) context.getBean("bike");
        bikeObj.drive();

        Tyre tyreObj = (Tyre) context.getBean("tyre");
        System.out.println(tyreObj);

        Car carObj = (Car) context.getBean("car");
        carObj.drive();
    }
}
