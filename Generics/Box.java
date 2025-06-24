package Generics;

public class Box<T> {
    T item;

    void setItem(T item){
        this.item=item;
    }

    T getItem(){
        return this.item;
    }
}
