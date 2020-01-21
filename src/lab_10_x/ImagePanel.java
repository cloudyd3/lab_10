package lab_10_x;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImagePanel extends JPanel {

    BufferedImage image = ImageIO.read(new File("dorime.jpg"));
    BufferedImage rotated;

    public ImagePanel() throws IOException {
    }

    @Override
    public void paintComponent (Graphics g) {
        Graphics2D graphics2D = (Graphics2D) g;
        graphics2D.drawImage(image, 0, 0, null);
    }

    public BufferedImage rotateImage(int angle) {
        AffineTransform at = AffineTransform.getTranslateInstance(100, 100);
        at.rotate(Math.toRadians(angle), image.getWidth() / 2, image.getHeight() / 2);
        Graphics2D graphics2D = image.createGraphics();
        graphics2D.drawImage(image, at, null);
        graphics2D.dispose();

        return rotated;
    }
}
