package shapes;

public class Rectangle extends Shape{
    public static final String Name = "Let's create rectangle!";

    public double areaRectangle() {
        double s = (getH()*getW());
        return s;
    }

}
