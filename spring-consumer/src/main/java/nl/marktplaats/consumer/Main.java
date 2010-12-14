package nl.marktplaats.consumer;

import javax.jms.JMSException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    private static ClassPathXmlApplicationContext applicationContext;

    public static void main(String... args) throws JMSException {
        System.out.println("Starting consumer...");
        applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
    }
}
