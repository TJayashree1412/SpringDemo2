package com.stackroute.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        Triangle triangle=new Triangle();
//        triangle.draw();
        //System.out.println( "Hello World!" );
        AbstractApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
        applicationContext.registerShutdownHook();
        Triangle triangle=(Triangle)applicationContext.getBean("triangle");
        triangle.draw();
    }
}
