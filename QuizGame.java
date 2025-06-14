import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] questions={"Fruit starting with 'a'?",
                            "Fruit starting with 'o'?"}; 
        String[][] options={{"1. apple","2. orange"},
                            {"1. apple","2. orange"}};

        int[] answers={1,2};

        int marks=0;
        int inputAnswer;


        System.out.println("**********");
        System.out.println("WELCOME TO QUIZ!");
        System.out.println("**********");


        for (int i = 0; i < questions.length; i++) {
            System.out.println("Question "+(i+1));
            System.out.println(questions[i]);
            System.out.println("Options:");
            for (String option:options[i]) {
                System.out.println(option);
            }
            System.out.print("Enter your choice:");
            inputAnswer=scanner.nextInt();
             System.out.println("**********");
            if (inputAnswer == answers[i]) {
                System.out.println("CORRECT");
                marks++;

            }else{
                System.out.println("WRONG");
            }

             System.out.println("**********");
        }
        System.out.println("Your total marks: "+marks);
        scanner.close();
    }
}
