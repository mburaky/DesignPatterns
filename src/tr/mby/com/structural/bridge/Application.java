package tr.mby.com.structural.bridge;

import tr.mby.com.structural.bridge.color.Blue;
import tr.mby.com.structural.bridge.color.Red;
import tr.mby.com.structural.bridge.shape.Circle;
import tr.mby.com.structural.bridge.shape.Square;

public class Application {

    public static void main(String[] args) {
        Square s1 = new Square(new Red());
        s1.draw();

        Square s2 = new Square(new Blue());
        s2.draw();

        Circle c1 = new Circle(new Red());
        c1.draw();

        // OUTPUT
        // Square filled with Red color
        // Square filled with Blue color
        // Circle filled with Red color

    }
}
