package Aggregation;

public class Library {
    String name;
    Book[] books;
    public Library(String name, Book[] books) {
        this.name = name;
        this.books = books;
    }

    void displayDetails(){
        System.out.println(name);
        System.out.println("Books:");
        for (Book book : books) {
            System.out.println(book.dipslayDetails());
        }
    }

}
