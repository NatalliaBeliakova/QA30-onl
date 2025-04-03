package homework_8.Task_1;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[5];
        figures[0] = new Triangle(5, 5, 8);
        figures[1] = new Rectangle(8, 12);
        figures[2] = new Circle(25);
        figures[3] = new Circle(9);
        figures[4] = new Triangle(4, 4, 4);

        double totalPerimeter = 0;
        for (Figure figure : figures) {
            totalPerimeter += figure.perimeter();
        }
        System.out.println("Сумма периметра всех фигур в массиве: " + totalPerimeter);
    }
}
