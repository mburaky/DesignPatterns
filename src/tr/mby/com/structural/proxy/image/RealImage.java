package tr.mby.com.structural.proxy.image;

public class RealImage implements Image {

    String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println(this.fileName + " is ready");
    }

    private void loadFromDisk(String fileName){
        System.out.println(fileName + " is loading...");
    }
}
