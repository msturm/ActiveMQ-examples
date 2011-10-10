package nl.marktplaats.producer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    private static ClassPathXmlApplicationContext brokerContext;
    private static ClassPathXmlApplicationContext applicationContext;

    public static void main(String... args) throws Exception {
        System.out.println("Starting Spring producer...");
        //brokerContext = new ClassPathXmlApplicationContext("jmsBroker.xml"); 
        applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        Producer producer = applicationContext.getBean(Producer.class);
        int x = 0;
        while(true) {
            //Thread.sleep(1000);
            producer.produceMessage(x);
            x++;
        }
        
    }
}
