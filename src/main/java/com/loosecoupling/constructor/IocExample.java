package com.loosecoupling.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IocExample {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationConstructorInjectionLooseCoupling.xml");
        UserManager userDatabase = (UserManager) context.getBean("userManagerWithDatabase");
        System.out.println(userDatabase.getUserInfo());

        ApplicationContext context1 = new ClassPathXmlApplicationContext("applicationConstructorInjectionLooseCoupling.xml");
        UserManager userNewDatabase = (UserManager) context1.getBean("userManagerWithNewDatabase");
        System.out.println(userNewDatabase.getUserInfo());

        ApplicationContext context2 = new ClassPathXmlApplicationContext("applicationConstructorInjectionLooseCoupling.xml");
        UserManager userManagerWithWebServiceProvider = (UserManager) context2.getBean("userManagerWithWebServiceProvider");
        System.out.println(userManagerWithWebServiceProvider.getUserInfo());
    }
}
