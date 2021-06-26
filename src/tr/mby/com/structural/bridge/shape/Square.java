package tr.mby.com.structural.bridge.shape;

import tr.mby.com.structural.bridge.color.Color;

public class Square extends Shape {

    public Square(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("Square filled with " + color.fill());
    }
}
