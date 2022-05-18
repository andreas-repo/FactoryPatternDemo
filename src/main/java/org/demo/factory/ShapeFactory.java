package org.demo.factory;

import org.demo.pattern.Shape;
import org.demo.pattern.impl.Circle;
import org.demo.pattern.impl.Rectangle;
import org.demo.pattern.impl.Square;

public class ShapeFactory {
    //use getShape() method to get object of shape type
    public Shape getShape(String shapeType) {
        if(shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        }
        if(shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        }
        if(shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}
