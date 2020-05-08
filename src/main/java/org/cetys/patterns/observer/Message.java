package org.cetys.patterns.observer;

/**
 * Created by edwin on May, 2020
 */
public class Message {
    final String messageContent;

    public Message (String m) {
        this.messageContent = m;
    }

    public String getMessageContent() {
        return messageContent;
    }
}
