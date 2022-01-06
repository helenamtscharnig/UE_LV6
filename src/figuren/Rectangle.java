package figuren;

public class Rectangle extends Figure {

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getPerimeter(){
        double per;
        per = (getLength()+getWidth())*2;
        return per;
    }

    public double getArea(){
        double area;
        area = getLength()*getWidth();
        return area;
    }



}
