package com.wdeng.spring;

import com.wdeng.spring.injection.service.InjectionService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-injection.xml");

        InjectionService service = (InjectionService) context.getBean("injectionService");
        service.save("This is the data to save");
    }
}
