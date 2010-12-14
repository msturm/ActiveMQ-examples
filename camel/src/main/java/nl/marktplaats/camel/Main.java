package nl.marktplaats.camel;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    
    private static ClassPathXmlApplicationContext applicationContext;

    public static void main(String... args) {
        System.out.println("Starting camel consumer");
        applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        while(true);
    }
}
