package main.java;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    public MyFrame(String title, int x, int y, boolean t) {
        ImageIcon icon = new ImageIcon("pic.png");
        this.setIconImage(icon.getImage());
        this.getContentPane().setBackground(new Color(0x123456));
        this.setTitle(title);
        this.setSize(x, y);
        this.setResizable(t);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}