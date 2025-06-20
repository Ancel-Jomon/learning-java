package Aggregation;

public class Book {
    String name;
    int price;
    public Book(String name, int price) {
        this.name = name;
        this.price = price;
    }

    String dipslayDetails(){
        return name +" "+price+ "rs";
    }
    
}
