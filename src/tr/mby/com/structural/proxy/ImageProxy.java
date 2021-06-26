package tr.mby.com.structural.proxy;

import tr.mby.com.structural.proxy.image.Image;
import tr.mby.com.structural.proxy.image.RealImage;

public class ImageProxy implements Image {

    public Image image;

    String fileName;

    public ImageProxy(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (image == null) {
            image = new RealImage(this.fileName);
        }
        image.display();
    }
}
