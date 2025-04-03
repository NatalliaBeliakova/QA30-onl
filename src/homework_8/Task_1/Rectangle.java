package homework_8.Task_1;

public class Rectangle extends Figure {
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double perimeter() {
        return (a + b) * 2;
    }

    @Override
    public double area() {
        return a * b;
    }
}
