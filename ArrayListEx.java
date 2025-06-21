import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> fruits = new ArrayList<>();
        String choice;

        while (true) {
            System.out.print("Enter fruit to add:");
            fruits.add(scanner.nextLine());
            System.out.print("Add more fruits(y/n):");
            choice= scanner.nextLine();
            if (!choice.equalsIgnoreCase("y")) {
                break;
            }
        }

        System.out.println("Your Fruits:");
        System.out.println(fruits);

        scanner.close();
    }
}
