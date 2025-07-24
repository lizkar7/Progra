package HW9_2;

public class Rectangel extends Figure {
    private double width;
    private double height;

    public Rectangel(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }
}
