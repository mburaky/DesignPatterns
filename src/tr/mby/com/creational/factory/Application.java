package tr.mby.com.creational.factory;

import tr.mby.com.creational.factory.shape.Shape;

public class Application {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape circle = shapeFactory.getShape(ShapeType.CIRCLE);
        Shape rectangle = shapeFactory.getShape(ShapeType.RECTANGLE);
        Shape square = shapeFactory.getShape(ShapeType.SQUARE);

        circle.draw();
        rectangle.draw();
        square.draw();

        // OUTPUT
        // Circle has been drawn
        // Rectangle has been drawn
        // Square has been drawn
    }
}
