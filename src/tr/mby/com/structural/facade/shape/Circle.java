package tr.mby.com.structural.facade.shape;

public class Circle implements Shape {
    
    @Override
    public void draw() {
        System.out.println("Circle has been drawn");
    }

    @Override
    public void delete() { System.out.println("Circle has been deleted"); }
}
