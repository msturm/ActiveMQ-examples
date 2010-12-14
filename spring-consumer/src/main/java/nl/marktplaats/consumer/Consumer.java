package nl.marktplaats.consumer;

import nl.marktplaats.MessageData;

public interface Consumer {
    void incomingMessage(String message);

    void incomingMessage(MessageData message);
}