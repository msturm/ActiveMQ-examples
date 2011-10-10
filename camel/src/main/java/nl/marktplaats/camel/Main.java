package nl.marktplaats.camel;
import org.apache.activemq.camel.CamelConnectionFactory;
import org.apache.camel.CamelContext;
import org.apache.camel.osgi.CamelContextFactory;
import org.apache.camel.util.CamelContextHelper;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    
    private static ClassPathXmlApplicationContext applicationContext;

    public static void main(String... args) throws Exception {
        System.out.println("Starting camel consumer");
        applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        String queueName = args[0];
        System.out.println("connecting to queue name " + queueName);
        CamelRouteConfig camelRouteConfig = (CamelRouteConfig)applicationContext.getBean("camelRouteConfig");
        camelRouteConfig.setIncomingQueue(queueName);
        
        CamelContext context = (CamelContext) applicationContext.getBean("defaultCamelContext");
        context.addRoutes(camelRouteConfig);
        
        while(true) {
            Thread.sleep(200);
        }
    }
}
