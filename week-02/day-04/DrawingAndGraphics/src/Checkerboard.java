import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {
    public static void mainDraw(Graphics graphics) {
        // Fill the canvas with a checkerboard pattern.
        int x = WIDTH/8;
        int y = HEIGHT/8;
        int size = HEIGHT/8;
        for (int column = 0; column < 8; column++) {
            for (int row = 0; row < 8; row++) {
                if (row % 2 == 0 && column % 2 == 0) {
                    graphics.fillRect(column * x, row * y, size, size);
                }
                if (row % 2 == 1 && column % 2 == 1) {
                    graphics.fillRect(column * x, row * y, size, size);
                }

            }
        }


    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}