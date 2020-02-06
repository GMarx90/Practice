import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[3];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj promie�");
        figures[0] = new Circle(scanner.nextDouble());

        System.out.println("Podaj 2 boki tr�jk�ta");
        figures[1] = new Triangle(scanner.nextDouble(), scanner.nextDouble());

        System.out.println("Podaj 2 boki prostok�ta");
        figures[2] = new Rectangle(scanner.nextDouble(), scanner.nextDouble());

        for (Figure figure : figures) {
            System.out.println(figure.getType());
            System.out.println("pole " + figure.getArea());
            System.out.println("obw�d " + figure.getPerimeter());
        }
    }
}
