package Polymorphism;

import java.util.Scanner;

public class Runtime {
    public static void main(String[] args) {
        

        Vehicle vehicle;

        Scanner scanner = new Scanner(System.in);

        int choice ;
        System.out.print("Car or bus(1/2)");
        choice = scanner.nextInt();

        if (choice==1) {
            vehicle=new Car();
            vehicle.move();
        }else if (choice==2) {
            vehicle=new Bus();
            vehicle.move();
        }

        

        scanner.close();
    }
}
