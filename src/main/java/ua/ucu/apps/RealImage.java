package ua.ucu.apps;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class RealImage implements MyImage {
    private JFrame frame;
    private String filename;
    
    public RealImage(String filename) {
        this.filename = filename;
        loadImage();
    }
    
    private void loadImage() {
        System.out.println("Loading image: " + filename);
        frame = new JFrame();
        ImageIcon icon = new ImageIcon(filename);
        JLabel label = new JLabel(icon);
        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        System.out.println("Image loaded!");
    }
    
    @Override
    public void display() {
        frame.setVisible(true);
    }
}