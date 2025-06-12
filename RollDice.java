import java.util.Random;
import java.util.Scanner;

public class RollDice {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numofDIce =0;
        int total=0;

        System.out.print("Enter number of dice:");
        numofDIce=scanner.nextInt();
        if (numofDIce >0) {
            for(int i=0;i<numofDIce;i++){
                int roll =random.nextInt(1,7);
                printDie(roll);
                total+=roll;
            }
            System.out.println("Total :"+total);
        } else {
            System.out.println("Number of dice cannot be negative or 0");
        }

        scanner.close();
    }

    static void printDie(int roll){

        String die1="""
                 -------
                |       |
                |   •   |
                |       |
                 -------
                """;
                String die2="""
                 -------
                |       |
                | •   • |
                |       |
                 -------
                """;
                String die3="""
                 -------
                | •     |
                |   •   |
                |     • |
                 -------
                """;
                String die4="""
                 -------
                | •   • |
                |       |
                | •   • |
                 -------
                """;
                String die5="""
                 -------
                | •   • |
                |   •   |
                | •   • |
                 -------
                """;
                String die6="""
                 -------
                | •   • |
                | •   • |
                | •   • |
                 -------
                """;
        switch(roll){
            case 1 -> System.out.println(die1);
            case 2 -> System.out.println(die2);
            case 3 -> System.out.println(die3);
            case 4 -> System.out.println(die4);
            case 5 -> System.out.println(die5);
            case 6 -> System.out.println(die6);

        }
    }
}