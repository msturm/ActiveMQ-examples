package nl.marktplaats.producer;

import nl.marktplaats.MessageData;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class JmsTemplateProducer implements Producer {
    
    @Autowired
    private JmsTemplate jmsTemplate;
    
    @Override
    public void produceMessage(int x) {
        System.out.println("Send message " + x + " from " + Thread.currentThread().getName());
        jmsTemplate.convertAndSend("Hello " + x + " world from " + Thread.currentThread().getName());
//        jmsTemplate.convertAndSend(new MessageData(x));
    }
}
