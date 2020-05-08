package org.cetys.patterns.observer;

/**
 * Created by edwin on May, 2020
 */
public class MessageSubscriberTwo implements Observer {
    @Override
    public void update(Message m) {
        System.out.println("MessageSubscriberTwo :: " + m.getMessageContent());
    }
}
