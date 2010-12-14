package nl.marktplaats.camel;

import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class HelloWorldProcessor implements Processor {

    @Override
    public void process(Exchange exchange) throws Exception {
        String body = (String) exchange.getIn().getBody();
        System.out.println("processing message: " + body);
        exchange.getIn().setBody("messagenumber: " + body.substring(19));
    }

}
