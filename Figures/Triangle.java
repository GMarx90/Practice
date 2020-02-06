
public class Triangle implements Figure {
    private double a;
    private double b;
    private double d

    public Triangle(double a, double b) {
        this.a = a;
        this.b = b;
        this.d = Math.sqrt(a * a + b * b);
    }

    public double getPerimeter() {
        return a + b + d
    }

    public double getArea() {
        return a * b / 2;
    }

    public String getType() {
        return "triangle";
    }
}