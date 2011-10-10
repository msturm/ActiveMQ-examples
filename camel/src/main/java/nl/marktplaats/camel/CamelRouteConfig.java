package nl.marktplaats.camel;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.spring.SpringRouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class CamelRouteConfig extends RouteBuilder {

    private String incomingQueue;
    
    public void setIncomingQueue(String incomingQueue) {
        this.incomingQueue = incomingQueue;
    }
    
    @Override
    public void configure() throws Exception {
//        from("file:/tmp/helloworldmessages/")
//            .process(new HelloWorldProcessor())
//            .process(new MessagePrinter())
//            .to("activemq:Testqueue");
//        from("rss:http://search.twitter.com/search.rss?q=marktplaats&consumer.delay=10000")
//        .process(new RssProcessor())
//        .to("file:/tmp/marktplaatstwitter/");
        from("activemq:" + incomingQueue)
            .process(new MessagePrinter())
            .setId("camelRouteConfig");
    }

}
