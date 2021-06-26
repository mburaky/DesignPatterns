package tr.mby.com.structural.facade.shape;

public class Square implements Shape {

    @Override
    public void draw() { System.out.println("Square has been drawn"); }

    @Override
    public void delete() { System.out.println("Square has been deleted"); }
}
