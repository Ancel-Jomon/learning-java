import java.util.Random;
import java.util.Scanner;

public class SlotMachine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double balance = 0;
        double betAmount = 0;
        String[] row;

        System.out.println("*************");
        System.out.println("WELCOME TO SLOT MACHINE");
        System.out.println("symbols : 1 2 3 4 5");
        System.out.println("*************");

        System.out.print("Enter money:");
        balance = scanner.nextDouble();

        System.out.println();

        while (balance > 0) {
            System.out.println("Current Balance:" + balance);
            System.out.print("Enter amount to bet:");
            betAmount = scanner.nextDouble();

            if (betAmount <= 0) {
                System.out.println("Bet Amount cannot be negative or 0");
                continue;
            } else if (balance < betAmount) {
                System.out.println("Low Funds");
                continue;
            } else {
                balance -= betAmount;
            }

            System.out.println("Spinning....");

            row = spinRow();
            printRow(row);

        }

        scanner.close();
    }

    static String[] spinRow() {

        String[] symbols = { "1", "2", "3", "4", "5" };
        String[] row = new String[3];

        Random random = new Random();
        for (int i = 0; i < row.length; i++) {
            row[i] = symbols[random.nextInt(symbols.length)];
        }

        return row;
    }

    static void printRow(String[] row) {
        System.out.println("*********");
        System.out.println(" " + String.join(" | ", row));
        System.out.println("*********");
    }
}