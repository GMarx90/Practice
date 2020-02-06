// Stwórz interfejs Figure. Interfejs powinien zawierać metody getPerimeter (zwracającą obwód) oraz getArea (zwracającą powierzchnię). Następnie utwórz klasy Circle, Triangle i Rectangle, niech każda z klas implementuje interfejs Figure. Napisz program, który pobierze od użytkownika:
// długość promienia koła,
// 2 długości boków trójkąta prostokątnego (boki przy kącie prostym),
// długość boków prostokąta.
// Utworzy instancje tych obiektów i umieści je w tablicy Figure[]. Następnie iterując po obiektach wyświetl pole oraz obwód aktualnego obiektu.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[3];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj promieñ");
        figures[0] = new Circle(scanner.nextDouble());

        System.out.println("Podaj 2 boki trójk¹ta");
        figures[1] = new Triangle(scanner.nextDouble(), scanner.nextDouble());

        System.out.println("Podaj 2 boki prostok¹ta");
        figures[2] = new Rectangle(scanner.nextDouble(), scanner.nextDouble());

        for (Figure figure : figures) {
            System.out.println(figure.getType());
            System.out.println("pole " + figure.getArea());
            System.out.println("obwód " + figure.getPerimeter());
        }
    }
}
