import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class HangmanWithFile {
    public static void main(String[] args) {

        String word ;
        int wrongGuess = 0;
        String guess;
        String filePath ="words.txt";

        ArrayList<Character> wordState;
        ArrayList<Integer> indexes;
        int maxWrongGuess = 6;

        try (Scanner scanner = new Scanner(System.in)) {

            wordState = new ArrayList<>();
            word=chooseWord(filePath);

            for (int i = 0; i < word.length(); i++) {
                wordState.add('_');
            }

            System.out.println("****************");
            System.out.println("Welcome to HangMan");
            System.out.println("****************");

            // printWordState(wordState);
            while (wrongGuess < maxWrongGuess && wordState.contains('_')) {
                System.out.println(hangMan(wrongGuess));
                printWordState(wordState);
                System.out.print("Enter your guess:");
                guess = scanner.next().toLowerCase();

                if (word.contains(guess)) {
                    indexes = findIndexes(word, guess);
                    for (Integer index : indexes) {

                        wordState.set(index, guess.charAt(0));
                    }
                } else {
                    System.out.println("wrong guess");
                    wrongGuess++;
                }

                
            }
            if (wrongGuess == maxWrongGuess || wordState.contains('_')) {
                System.out.println(hangMan(wrongGuess));
                System.out.println(" YOU DIED");
                System.out.println("Correct word: "+word);

            } else {
                System.out.println("YOU WON");
                System.out.println("Corect word: "+word);
            }

        } catch (Exception e) {

        }
    }
    static String chooseWord(String filePath){
        String line="";
        ArrayList<String>  words = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            while ((line = reader.readLine()) != null) {
                words.add(line);
            }
            Random random = new Random();
            return words.get(random.nextInt(words.size()));
            
        }catch(FileNotFoundException e){
            System.out.println("File not found");
        }
         catch ( IOException e) {
           System.out.println("something went wrong");
        }
        return "";
    }
    static void printWordState(ArrayList<Character> wordList){
        System.out.print("Word: ");
            for (Character character : wordList) {
                System.out.print(character +" ");
            }
            System.out.println();
    }
    static ArrayList<Integer> findIndexes(String word, String guess) {

        ArrayList<Integer> index = new ArrayList<>();
        int searchIndex = 0;
        while (true) {
            searchIndex = word.indexOf(guess, searchIndex);
            if (searchIndex == -1) {
                break;
            }
            index.add(searchIndex);
            searchIndex++;

        }

        return index;
    }

    static String hangMan(int wrongGuess) {
        return switch (wrongGuess) {
            case 0 -> """


                    """;
            case 1 -> """
                             o

                    """;
            case 2 -> """
                             o
                             |
                    """;
            case 3 -> """
                             o
                            /|

                    """;
            case 4 -> """
                             o
                            /|\\

                    """;
            case 5 -> """
                             o
                            /|\\
                            /
                    """;
            case 6 -> """
                             o
                            /|\\
                            / \\
                    """;
            default -> "";
        };
    }

}
