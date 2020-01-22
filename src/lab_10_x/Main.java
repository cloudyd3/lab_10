package lab_10_x;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class Main extends JFrame {
    private static int counter = 0;
    public static void main(String[] args) throws IOException {
        ImagePanel imagePanel = new ImagePanel();
        JButton button = new JButton("rotate 45");
        JFrame frame = new JFrame();
		frame.setLayout(new BorderLayout());
		frame.add(imagePanel, BorderLayout.CENTER);
		frame.add(button, BorderLayout.PAGE_END);
        frame.setSize(600, 600);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        button.addActionListener(e -> {
            int angle = counter * 45;
            imagePanel.rotateImage(angle);
            counter++;
        });
    }
}
