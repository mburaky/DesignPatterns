package tr.mby.com.structural.bridge.shape;

import tr.mby.com.structural.bridge.color.Color;

public class Circle extends Shape {

    public Circle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("Circle filled with " + color.fill());
    }
}
