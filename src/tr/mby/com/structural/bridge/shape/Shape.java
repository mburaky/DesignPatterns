package tr.mby.com.structural.bridge.shape;

import tr.mby.com.structural.bridge.color.Color;

public abstract class Shape {

    Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public abstract void draw();
}
