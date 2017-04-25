package com.wdeng.spring.beanannotation;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("prototype")
@Component
public class BeanAnnotation {
    public void say(String arg) {
        System.out.println("BeanAnnotation say: " + arg);
    }

    public void myHashCode() {
        System.out.println("BeanAnnotation: " + this.hashCode());
    }
}
