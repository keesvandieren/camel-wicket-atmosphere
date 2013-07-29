package com.squins.cawa;

import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * A main to just run this module :).
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext
                ("classpath:cawa-commons-context.xml");


        SampleProducer producer = context.getBean(SampleProducer.class);

        producer.produce("Hoi");
        producer.produce("Bye");
        Thread.sleep(3000L);


    }
}
