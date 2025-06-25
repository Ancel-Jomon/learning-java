package Enum;

public class Enum {
    public static void main(String[] args) {
        

        Day day = Day.MONDAY;

        System.out.println(day);

        switch (day) {
            case MONDAY,TUESDAY,THURSDAY,FRIDAY,WEDNESDAY 
            ->  System.out.println("weekday");
        
            case SATURDAY,SUNDAY -> System.out.println("weekend");
        }
    }
}
