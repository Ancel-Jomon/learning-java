package Generics;

public class Main {
    public static void main(String[] args) {
        
        Box<String> box = new Box<>();

        box.setItem("apple");

        System.out.println(box.getItem());
    }
}
