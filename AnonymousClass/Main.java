package AnonymousClass;

public class Main {

    public static void main(String[] args) {
        Dog dog1 = new Dog();

        Dog dog2 = new Dog(){

            @Override
            void speak(){
                System.out.println("special dog barks");
            }
        };

        dog1.speak();
        dog2.speak();
    }
}
