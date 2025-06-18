package ShapesAbstraction;

public class Square extends Shape{
    double length ,breadth;

    Square(double length,double breadth){
        this.length=length;
        this.breadth=breadth;
    }
    @Override
    double area() {

        return  this.length* this.breadth;
       }
    
}
