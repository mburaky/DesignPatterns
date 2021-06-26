package tr.mby.com.structural.facade;

import tr.mby.com.structural.facade.shape.Circle;
import tr.mby.com.structural.facade.shape.Rectangle;
import tr.mby.com.structural.facade.shape.Square;

public class ShapeMaker {

    Circle circle;

    Rectangle rectangle;

    Square square;

    public ShapeMaker() {
        this.circle = new Circle();
        this.rectangle = new Rectangle();
        this.square = new Square();
    }

    public void drawShapes() {
        circle.draw();
        rectangle.draw();
        square.draw();
    }

    public void deleteShapes() {
        circle.delete();
        rectangle.delete();
        square.delete();
    }


}
