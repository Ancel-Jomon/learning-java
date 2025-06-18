package ShapesAbstraction;

public class Circle extends Shape{


    double radius;

    Circle(double radius){
        this.radius=radius;
    }
    @Override
    double area() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    void display(){
        System.out.println("This is a circle");
    }
    
}
