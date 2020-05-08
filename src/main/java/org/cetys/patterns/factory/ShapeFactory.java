package org.cetys.patterns.factory;

/**
 * Created by edwin on Apr, 2020
 */
public class ShapeFactory {
    //use getShape method to get object of type shape
    public Shape createShape(String shapeType){
        final Shape shape;
        switch (shapeType.toLowerCase()) {
            case "ellipse":
                shape = new Ellipse();
                break;
            case "rectangle":
                shape = new Rectangle();
                break;
            case "line":
                shape = new Line();
                break;
            case "curve":
                shape = new Curve();
                break;
            default:
                shape = null;
        }

        return shape;
    }
}
