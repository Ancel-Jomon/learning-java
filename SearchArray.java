import java.util.Scanner;

public class SearchArray {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        stringSearch();

        scanner.close();
    }
    static void stringSearch(){
        String[] fruits={"apple","banana","orange","pineapple"};
        String target=scanner.nextLine();
        boolean fruitFound=false;


        for (int i=0;i<fruits.length;i++) {
            if (fruits[i].equals(target)) {
                System.out.println(i);
                fruitFound=true;
                break;
            }
        }
        if (!fruitFound) {
            System.out.println("not found");
        }

    }
    static void numSearch(){
        int[] numbers ={1,2,3,6,4,0,9,7,8};

        int target=27;
        boolean numFound=false;

        for (int i=0;i<numbers.length;i++) {
            if (numbers[i] == target) {
                System.out.println("Found at:"+i);
                numFound=true;
                break;
            }
        }

        if (!numFound) {
            System.out.println("traget not present");
        }
    }
}
