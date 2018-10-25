public class ResizeableTest {
    public static void main(String[] args) {
        Circle circle = new Circle(3);
        System.out.println("CIRCLE");
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());
        System.out.println("---------");
        circle.resize(150);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());

        System.out.println("RECTANGLE");
        Rectangle rectangle = new Rectangle(3,5);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
        System.out.println("--------");
        rectangle.resize(140);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());

        System.out.println("SQUARE");
        Square square = new Square(4);
        System.out.println(square.getPerimeter());
        System.out.println(square.getArea());
        System.out.println("--------");
        square.resize(200);
        System.out.println(square.getPerimeter());
        System.out.println(square.getArea());
    }
}
