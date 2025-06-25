package Enum;

public enum Day {
    SUNDAY(0) , MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(4), FRIDAY(5), SATURDAY(6);

    private final int dayNumber;
    Day(int dayNumber){
        this.dayNumber = dayNumber;
    }

    int getDayNumber(){
        return this.dayNumber;
    }
}
