package figuren;

public class FigureDemo {
    public static void main(String[] args) {

        Circle c1 = new Circle(2.4);
        Circle c2 = new Circle(1.3);
        Rectangle r1 = new Rectangle(2.0, 1.5);
        Rectangle r2 = new Rectangle(4.5, 2.3);
        Rectangle r3 = new Rectangle(5.0, 1.0);

        FigureManager f1 = new FigureManager();
        f1.add(c1);
        f1.add(c2);
        f1.add(r1);
        f1.add(r2);
        f1.add(r3);

        System.out.println(c1.getPerimeter());
        System.out.println(r2.getPerimeter());
        System.out.println(r3.getArea());

        System.out.println("....");
        System.out.println(f1.getMaxPerimeter());
        System.out.println(f1.getAverageAreaSize());
        System.out.println(f1.getAreaBySizeCategories());


    }
}
