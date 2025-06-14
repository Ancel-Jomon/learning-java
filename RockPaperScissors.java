import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] choices={"rock","paper","scissors"};

        String userChoice;
        String computerChoice;
        System.out.println("Welcom to Rock-Paper-Scissors");

        while (true) {
            System.out.println("The choices:");
            for (String string : choices) {
                System.out.println(string);
            }
            System.out.print("Enter your choice:");
            userChoice=scanner.nextLine().toLowerCase();

            if (!(userChoice.equals("rock") || 
                userChoice.equals("paper") ||
                userChoice.equals("scissors"))) {

                    System.out.println("Invalid choice");
                    continue;
                
            }

            computerChoice=choices[random.nextInt(0,3)];
            System.out.println("computer choice: "+computerChoice);

            if (userChoice.equals(computerChoice)) {
                System.out.println("Its a tie!");
            } else if ((userChoice.equals("rock") && computerChoice.equals("scissors")) ||
                        (userChoice.equals("paper") && computerChoice.equals("rock")) ||
                        (userChoice.equals("scissors") && computerChoice.equals("paper"))) {
                            System.out.println("You win!");
            } else {
                System.out.println("You Lose");
            }

            System.out.print("Play again?(y/n):");
            if (!scanner.nextLine().toLowerCase().equals("y")) {
                break;
            }

            
        }

        System.out.println("Thank You for playing");
        scanner.close();
    }
}
