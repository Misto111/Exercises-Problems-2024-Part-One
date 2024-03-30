package shape;

public class Main {
    public static void main(String[] args) {

        Shape shape = new Rectangle(4, 5);
         shape = new Circle(2);

        System.out.println(shape.calculateArea());
        System.out.println(shape.calculatePerimeter());

        System.out.println();

        System.out.println(shape.calculateArea());
        System.out.println(shape.calculatePerimeter());


    }
}
