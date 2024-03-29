package life.captainxyw.decorator;

public class ShapeDecorator implements Shape {

    private Shape shape;

    public ShapeDecorator(Shape shape) {
        this.shape = shape;
    }

    @Override
    public void draw() {
        shape.draw();
        System.out.println("draw border....");
    }
}
