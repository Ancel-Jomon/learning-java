package ShapesAbstraction;

public class Main {
    public static void main(String[] args) {
        
        Circle circle = new Circle(5);

        Square square= new Square(5, 5);

        Triangle triangle= new Triangle(5, 2);

        System.out.println(circle.area());
        System.out.println(triangle.area());
        System.out.println(square.area());
        
    }
}
