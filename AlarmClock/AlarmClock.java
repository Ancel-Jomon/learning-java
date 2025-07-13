package AlarmClock;

import java.time.LocalTime;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import java.io.File;
import java.io.IOException;

public class AlarmClock implements Runnable {
    private final LocalTime alarmTime;
    private final String filePath;
    private final Scanner scanner;

    AlarmClock(LocalTime alarmTime, String filePath,Scanner scanner) {
        this.alarmTime = alarmTime;
        this.filePath = filePath;
        this.scanner=scanner;
    }

    @Override
    public void run() {
        while (LocalTime.now().isBefore(alarmTime)) {
            try {
                Thread.sleep(1000);
                LocalTime now = LocalTime.now();
                int hours = now.getHour();
                int minutes = now.getMinute();
                int seconds = now.getSecond();

                System.out.printf("\r%02d :%02d :%02d", hours, minutes, seconds);

            } catch (InterruptedException e) {
                System.out.println("Thread Interrupted!!");
            }
        }
        playAlarm();
    }

    private void playAlarm() {
        try (AudioInputStream inputStream = AudioSystem.getAudioInputStream(new File(filePath));) {
            Clip clip = AudioSystem.getClip();
            clip.open(inputStream);
            clip.start();
            System.out.println("\npress enter!!");
            scanner.nextLine();
            clip.stop();

        } catch (UnsupportedAudioFileException e) {
            System.out.println("Audio file not supported");
        }
        catch(LineUnavailableException e){
            System.out.println("unable to play audio");
        }catch(IOException e){
            System.out.println("file error");
        }
    }
}
