package nl.marktplaats.camel;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class MessagePrinter implements Processor {

    @Override
    public void process(Exchange exchange) throws Exception {
        System.out.println("message printer data");
        System.out.println(exchange.getIn().getHeaders());
        System.out.println(exchange.getIn().getBody());
    }

}
