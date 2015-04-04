package shapes;

public class Triangle extends Shape {
    public static final String Name = "Let's create triangle!";

    public double areaTriangle() {
        double s = (getH()*getA())/2;
        return s;
    }
}
