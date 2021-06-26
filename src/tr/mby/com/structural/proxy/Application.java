package tr.mby.com.structural.proxy;

import tr.mby.com.structural.proxy.image.Image;

public class Application {

    public static void main(String[] args) {
        Image image = new ImageProxy("image.png");

        image.display();
        image.display();

        // OUTPUT
        // image.png is loading...
        // image.png is ready
        // image.png is ready
    }
}
