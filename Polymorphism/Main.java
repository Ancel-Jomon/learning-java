package Polymorphism;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Bus bus = new Bus();

        Vehicle[] vehicles= {car,bus};

        for(Vehicle vehicle:vehicles){
            vehicle.move();
        }
    }
}
