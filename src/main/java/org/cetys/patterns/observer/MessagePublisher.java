package org.cetys.patterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by edwin on May, 2020
 */
//This class extends Subject interface.
public class MessagePublisher implements Subject {

    private List<Observer> observers = new ArrayList<>();

    @Override
    public void attach(Observer o) {
        observers.add(o);
    }

    @Override
    public void detach(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyUpdate(Message m) {
        for(Observer o: observers) {
            o.update(m);
        }
    }
}
