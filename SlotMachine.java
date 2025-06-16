import java.util.Random;
import java.util.Scanner;

public class SlotMachine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double balance = 0;
        double betAmount = 0;
        String[] row;
        double payout;
        String playAgain;

        System.out.println("*************");
        System.out.println("WELCOME TO SLOT MACHINE");
        System.out.println("symbols : 1 2 3 4 5");
        System.out.println("*************");

        System.out.print("Enter money:");
        balance = scanner.nextDouble();

        System.out.println();

        while (balance > 0) {
             System.out.println("*************");
            System.out.println("Current Balance:" + balance);
            System.out.print("Enter amount to bet:");
            betAmount = scanner.nextDouble();
            scanner.nextLine();

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
            payout = givePayout(row, betAmount);
            System.out.println("You won:"+payout);
            balance+=payout;

            System.out.print("Do you want to play again?(y/n):");
            playAgain=scanner.nextLine().trim().toLowerCase();
            if (!playAgain.equals("y")) {
                break;
            }

        }
        System.out.println("Your balance:"+balance);
        System.out.println("Thank you for playing!");
        scanner.close();
    }

    static double givePayout(String[] row, double betAmount) {

        if (row[0].equals(row[1]) && row[0].equals(row[2])) {
            return switch (row[0]) {
                case "1" -> 2 * betAmount;
                case "2" -> 4 * betAmount;
                case "3" -> 6 * betAmount;
                case "4" -> 8 * betAmount;
                case "5" -> 10 * betAmount;
                default -> 0;
            };
        } else if (row[0].equals(row[1]) || row[0].equals(row[2])) {
            return switch (row[0]) {
                case "1" -> 1 * betAmount;
                case "2" -> 2 * betAmount;
                case "3" -> 3 * betAmount;
                case "4" -> 4 * betAmount;
                case "5" -> 5 * betAmount;
                default -> 0;
            };
        } else if (row[1].equals(row[2])) {
            return switch (row[1]) {
                case "1" -> .1 * betAmount + betAmount;
                case "2" -> .2 * betAmount + betAmount;
                case "3" -> .3 * betAmount + betAmount;
                case "4" -> .4 * betAmount + betAmount;
                case "5" -> .5 * betAmount + betAmount;
                default -> 0;
            };
        }

        System.out.println("You didnt win anything.Try again!");

        return 0;
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
        System.out.println("****************");
        System.out.println(" " + String.join(" | ", row));
        System.out.println("****************");
    }

}