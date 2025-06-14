public class VarArgs {
    public static void main(String[] args) {
        avg();
    }

    static void add(int... numbers){
        for (int i : numbers) {
            System.out.println(i);
        }
    }

    static void avg(int... numbers){
        double sum=0;
        double avg=0;
        for (int i : numbers) {
            sum+=i;
        }
        avg=(numbers.length !=0)?sum/numbers.length:0;
        System.out.println(avg);
    }
}
