import java.util.ArrayList;
import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {

        String word = "fool";
        int wrongGuess = 0;
        String guess;

        ArrayList<Character> wordState;
        ArrayList<Integer> indexes;
        int maxWrongGuess = 6;

        try (Scanner scanner = new Scanner(System.in)) {

            wordState = new ArrayList<>();

            for (int i = 0; i < word.length(); i++) {
                wordState.add('_');
            }

            System.out.println("****************");
            System.out.println("Welcome to HangMan");
            System.out.println("****************");

            printWordState(wordState);
            while (wrongGuess < maxWrongGuess && wordState.contains('_')) {
                System.out.println(hangMan(wrongGuess));
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

                printWordState(wordState);
            }
            if (wrongGuess == maxWrongGuess || wordState.contains('_')) {
                System.out.println(hangMan(wrongGuess));
                System.out.println(" YOU DIED");
                System.out.println("Correct word: "+word);

            } else {
                System.out.println("YOU WON");
            }

        } catch (Exception e) {

        }
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
