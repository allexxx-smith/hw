package shapes;

public class Circle extends Shape {
    public static final String Name = "Let's create circle!";

    public double areaCircle() {
        double s = Math.PI*getR()*getR();
        return s;
    }

}