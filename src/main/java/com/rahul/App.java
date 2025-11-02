package com.rahul;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sun.security.krb5.internal.crypto.Des;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Developer developer1 = (Developer) context.getBean("developer1");
        System.out.println(developer1.getAge());
        developer1.code();

//        Developer developer2 = (Developer) context.getBean("developer1");
//        System.out.println(developer2.getAge());
//        developer2.code();

//        Desktop desktop = context.getBean("com1", Desktop.class);
        Desktop desktop = context.getBean(Desktop.class);

    }
}
