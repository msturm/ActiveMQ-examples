package nl.marktplaats.camel;

import org.apache.camel.spring.SpringRouteBuilder;
import org.springframework.stereotype.Component;

//@Component
public class MarktplaatsTwitter extends SpringRouteBuilder {

    @Override
    public void configure() throws Exception {
        from("rss:http://search.twitter.com/search.rss?q=marktplaats&consumer.delay=10000")
        .process(new RssProcessor())
        .to("file:/tmp/marktplaatstwitter/");
    }
    
}
