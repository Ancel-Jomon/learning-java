package Inheritance;

public class Fish implements Prey,Hunter {

    @Override
    public void flee() {
       System.out.println("Larger fish going to eat this fish");
    }

    @Override
    public void hunt(){
        System.out.println("This fish eats smaller fish");
    }
    
}
