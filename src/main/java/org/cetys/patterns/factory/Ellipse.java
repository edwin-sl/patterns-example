package org.cetys.patterns.factory;

/**
 * Created by edwin on Apr, 2020
 */
// Concrete Product
public class Ellipse implements Shape {
    @Override
    public void draw() {
        System.out.println("Draw ellipse");
    }
}
