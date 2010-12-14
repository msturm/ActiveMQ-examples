package nl.marktplaats.camel;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import com.sun.syndication.feed.synd.SyndEntry;
import com.sun.syndication.feed.synd.SyndFeed;

public class RssProcessor implements Processor {

    @Override
    public void process(Exchange exchange) throws Exception {
        SyndFeed body = (SyndFeed) exchange.getIn().getBody();
        SyndEntry entry = (SyndEntry) body.getEntries().get(0);
        System.out.println("Twitter message: " + entry.getTitle());
        exchange.getIn().setBody(entry.getTitle());
    }

}
