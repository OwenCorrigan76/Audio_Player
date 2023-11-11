package main.java;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MyAudioPlayer {
    public MyAudioPlayer() throws LineUnavailableException, UnsupportedAudioFileException, IOException {
        Scanner scanner = new Scanner(System.in);
        File file = new File("audio.wav");
        AudioInputStream audioInput = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioInput);
        String response = "";
        while (!response.equals("Q") || !response.equals("q")) {
            System.out.println("Play = p, Stop = s");
            System.out.print("Enter choice:");
            response = scanner.next();
            switch (response) {
                case ("p"):
                    clip.start();
                    break;
                case ("s"):
                    clip.stop();
                    break;
                default:
                    System.out.println("Not a valid choice");
            }
        }
    }
}


