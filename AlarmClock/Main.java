package AlarmClock;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime alarmTime = null;
        String filePath = "C:\\Users\\ANCEL PUTHOOR\\Downloads\\in-memoriam-by-onycs.wav";

        while (alarmTime == null) {
            try {
                System.out.println("enter time:");
                String time = scanner.nextLine();
                alarmTime = LocalTime.parse(time, formatter);
                System.out.println(alarmTime);

            } catch (DateTimeParseException e) {
                System.out.println("Invalid format, use HH:MM:SS");

            }
        }

        AlarmClock alarmClock = new AlarmClock(alarmTime,filePath,scanner);
        Thread alarmThread = new Thread(alarmClock);
        alarmThread.start();
        try {
            alarmThread.join();
        } catch (InterruptedException e) {
           System.out.println("Thread Interrupted");
        }

        scanner.close();
    }
}
