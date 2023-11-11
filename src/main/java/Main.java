package main.java;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws UnsupportedAudioFileException, LineUnavailableException, IOException {
        new MyFrame("Owen", 220, 220, true);
        new MyFrame("Gayle", 110, 110, false);
        new MyAudioPlayer();
    }
}


