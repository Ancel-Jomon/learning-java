package AudioPlayer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class AudioPlayer {

    public static void main(String[] args) {
        String filePath = "C:\\Users\\ANCEL PUTHOOR\\Downloads\\in-memoriam-by-onycs.wav";

        File file = new File(filePath);
        String response;

        try (Scanner scanner = new Scanner(System.in);
                AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)) {
            Clip clip = AudioSystem.getClip();

            clip.open(audioStream);

            do {
                System.out.println("p : play");
                System.out.println("s : stop");
                System.out.println("r : restart");
                System.out.println("q : quit");
                System.out.print("Enter your choice:");
                response = scanner.nextLine();
                switch (response) {
                    case "p" -> clip.start();
                    case "s" -> clip.stop();
                    case "r" -> clip.setMicrosecondPosition(0);
                    case "q" -> clip.close();

                    default -> System.out.println("Invalid choice");
                }

            } while (!response.equals("q"));



        } catch (LineUnavailableException e) {
            System.out.println("cannot access file");
        } catch (UnsupportedAudioFileException e) {
            System.out.println("audio format not supported");
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        } catch (IOException e) {
            System.out.println("something went wrong");
        }

        finally{
            System.out.println("exited");
        }

    }
}