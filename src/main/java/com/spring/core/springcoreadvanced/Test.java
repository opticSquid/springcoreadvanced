package com.spring.core.springcoreadvanced;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	private static ApplicationContext ctx;
    public static void main(String[] args) {
        ctx = new ClassPathXmlApplicationContext("com/spring/core/springcoreadvanced/placeHolderConfig.xml");
        MyDAO dao = (MyDAO) ctx.getBean("myDAO");
        System.out.println(dao);
    }
}
