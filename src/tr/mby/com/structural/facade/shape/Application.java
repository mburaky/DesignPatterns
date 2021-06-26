package tr.mby.com.structural.facade.shape;

import tr.mby.com.structural.facade.ShapeMaker;

public class Application {

    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawShapes();
        System.out.println("======");
        shapeMaker.deleteShapes();

        // OUTPUT
        // Circle has been drawn
        // Rectangle has been drawn
        // Square has been drawn
        // ======
        // Circle has been deleted
        // Rectangle has been deleted
        // Square has been deleted
    }
}
