package tr.mby.com.creational.factory;

import tr.mby.com.creational.factory.shape.Circle;
import tr.mby.com.creational.factory.shape.Rectangle;
import tr.mby.com.creational.factory.shape.Shape;
import tr.mby.com.creational.factory.shape.Square;

public class ShapeFactory {

    public Shape getShape(ShapeType shapeType) {
        if (shapeType == ShapeType.CIRCLE) {
            return new Circle();
        } else if (shapeType == ShapeType.RECTANGLE) {
            return new Rectangle();
        } else if (shapeType == ShapeType.SQUARE) {
            return new Square();
        }
        return null;
    }
}
