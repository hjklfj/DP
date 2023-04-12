package life.captainxyw.decorator;

/**
 * InputStream HttpSerlvetRequest
 */
public class Main {

    public static void main(String[] args) {
        ShapeDecorator circleWithBorder = new ShapeDecorator(new Circle());
        circleWithBorder.draw();
    }
}
