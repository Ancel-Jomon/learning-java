package Timer;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class CountDown {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int response ;
        Timer timer = new Timer();
        TimerTask task;

        System.out.print("Enter the count:");
        response = scanner.nextInt();

        task = new TimerTask() {
            int count = response;

            @Override
            public void run() {
                System.out.println(count);
                count--;
                if (count < 0) {
                    timer.cancel();
                }
            }

        };
        timer.scheduleAtFixedRate(task, 0, 1000);
        ;

        scanner.close();
    }
}
