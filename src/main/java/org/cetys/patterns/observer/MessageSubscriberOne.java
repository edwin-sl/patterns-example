package org.cetys.patterns.observer;

/**
 * Created by edwin on May, 2020
 */
// This class extends Observer interface.
public class MessageSubscriberOne implements Observer
{
    @Override
    public void update(Message m) {
        System.out.println("MessageSubscriberOne :: " + m.getMessageContent());
    }
}
