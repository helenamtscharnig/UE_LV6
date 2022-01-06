package figuren;

public class Circle extends Figure {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getPerimeter(){
        double per;
        per = 2 * getRadius() * 3.14;
        return per;
    }

    public double getArea(){
        double area;
        area = getRadius()*getRadius()*3.14;
        return area;
    }



}
