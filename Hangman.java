import java.util.ArrayList;
import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {

        String word = "fool";
        int wrongGuess = 0;
        String guess;
        int charIndex;
        ArrayList<Character> wordState ;
        ArrayList<Integer> indexes;
        int maxWrongGuess=5;

        try (Scanner scanner = new Scanner(System.in)) {

            wordState= new ArrayList<>();

            for (int i = 0; i < word.length(); i++) {
                wordState.add('_');
            }

            while (wrongGuess < maxWrongGuess && wordState.contains('_')) {
                System.out.print("Enter your guess");
                guess = scanner.next();

               if (word.contains(guess)) {
                    indexes=findIndexes(word, guess);
                    for (Integer index : indexes) {
                       
                        wordState.set(index, guess.charAt(0));
                    }
               }else{
                wrongGuess++;
               }

                System.out.println(wordState);
            }
            if (wrongGuess == maxWrongGuess || wordState.contains('_')) {
                System.out.println(" you failed");
            }
            else{
                System.out.println("you won");
            }
           

        } catch (Exception e) {

        }
    }

    static ArrayList<Integer> findIndexes(String word, String guess) {

        ArrayList<Integer> index = new ArrayList<>();
        int searchIndex = 0;
        while (true) {
            searchIndex=word.indexOf(guess, searchIndex);
            if (searchIndex ==-1) {
                break;
            }
            index.add(searchIndex);
            searchIndex++;
            
        }

        return index;
    }
}
