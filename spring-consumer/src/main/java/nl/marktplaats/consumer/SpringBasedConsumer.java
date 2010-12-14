package nl.marktplaats.consumer;

import nl.marktplaats.MessageData;

import org.springframework.stereotype.Component;

@Component
public class SpringBasedConsumer implements Consumer {
    
    @Override
    public void incomingMessage(String message) {
        System.out.println("Consumer " + Thread.currentThread().getName() + " received message: " + message);
    }
    
    @Override
    public void incomingMessage(MessageData message) {
        System.out.println("Received messagedata object: " + message.toString());
    }
}
