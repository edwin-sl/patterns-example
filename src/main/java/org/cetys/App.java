package org.cetys;

import org.cetys.patterns.factory.Shape;
import org.cetys.patterns.factory.ShapeFactory;
import org.cetys.patterns.observer.Message;
import org.cetys.patterns.observer.MessagePublisher;
import org.cetys.patterns.observer.MessageSubscriberOne;
import org.cetys.patterns.observer.MessageSubscriberTwo;
import org.cetys.patterns.singleton.DBManager;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        // TEST FACTORY

        ShapeFactory factory = new ShapeFactory();
        Shape curve = factory.createShape("curve");
        Shape rectangle = factory.createShape("rectangle");

        curve.draw();
        rectangle.draw();


        // TEST SINGLETON

        DBManager.getInstance().insert("name", "Edwin");
        var names = DBManager.getInstance().select("name");
        for (String name : names) {
            System.out.println(name);
        }


        //TEST OBSERVER

        MessageSubscriberOne s1 = new MessageSubscriberOne();
        MessageSubscriberTwo s2 = new MessageSubscriberTwo();

        MessagePublisher p = new MessagePublisher();

        p.attach(s1);
        p.attach(s2);

        p.notifyUpdate(new Message("First Message"));   //s1 and s2 will receive the update

        p.detach(s1);

        p.notifyUpdate(new Message("Second Message")); //s2 will receive the update
    }
}
