package Threading;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("Fives seconds counter starts!!");
        Scanner scanner = new Scanner(System.in);
        String name;
        MyRunnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        thread.setDaemon(true);
        thread.start();

        name = scanner.nextLine();

        System.out.println(name);


        scanner.close();
    }
}
