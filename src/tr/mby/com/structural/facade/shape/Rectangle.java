package tr.mby.com.structural.facade.shape;

public class Rectangle implements Shape {

    @Override
    public void draw() { System.out.println("Rectangle has been drawn"); }

    @Override
    public void delete() { System.out.println("Rectangle has been deleted"); }
}
