package Aggregation;

public class Main {
    public static void main(String[] args) {
        Book book1= new Book("Lord of the mysteries", 200);
        Book book2= new Book("Renegade Immortal", 150);
        Book book3= new Book("Lord of the Rings", 250);

        Book[] books = {book1,book2,book3};

        
        Library li= new Library("School Library", books);
        li.displayDetails();
    }
}
