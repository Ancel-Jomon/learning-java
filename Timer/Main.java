package Timer;

import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) {
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {

            int count =4;
            @Override
            public void run(){
                System.out.println("haii");
                count--;
                if (count<=0) {
                    timer.cancel();
                }
            }
        };

        timer.schedule(task, 00,2000);
    }
}
