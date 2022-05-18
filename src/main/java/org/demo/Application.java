package org.demo;

import org.demo.factory.ShapeFactory;
import org.demo.pattern.Shape;

public class Application {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        //get object of circle and call its draw() method
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();

        Shape shape3 = shapeFactory.getShape("SQUARE");
        shape3.draw();
    }
}
