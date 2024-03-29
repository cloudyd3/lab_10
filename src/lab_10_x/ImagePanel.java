package lab_10_x;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImagePanel extends JPanel {

    private BufferedImage image = ImageIO.read(new File("Lenna.png"));
    int rotAngle;

    public ImagePanel() throws IOException {
    }

    public void rotateImage(int angle) {
        rotAngle = angle;
        repaint();
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        AffineTransform at = new AffineTransform();
        at.translate(getWidth() >> 1, getHeight() >> 1);
        at.rotate(Math.toRadians(rotAngle));
        at.scale(0.7,0.7);
        at.translate(-image.getWidth() >> 1, -image.getHeight() >> 1);
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(image, at, null);
    }
}
