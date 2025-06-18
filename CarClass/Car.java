package CarClass;

public class Car {
    String make;
    String model;

    int year;
    double price;

    boolean isRunning;

    Car(String make,    String model,    int year,    double price){
            this.make=make;
            this.model=model;
            this.year=year;
            this.price=price;
    }


    @Override
    public String toString(){

        return this.make+ " "+this.model+ " "+this.year+" "+this.price;
    }
}
