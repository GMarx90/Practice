public class Rectangle implements Figure {


    public double A;
    public double B;

    public Rectangle(double A, double B) {
        this.A = A;
        this.B = B;
    }

  

    public double getArea() {
        return A * B;
    }

    public double getPerimeter() {
        return 2 * A + 2 * B;
    }
  
	public String getType() {
        return "rectangle";
    }
}