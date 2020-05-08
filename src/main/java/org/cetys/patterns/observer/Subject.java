package org.cetys.patterns.observer;

/**
 * Created by edwin on May, 2020
 */
// TODO: change to use template
public interface Subject<T>
{
    void attach(Observer o);
    void detach(Observer o);
    void notifyUpdate(Message m);
}