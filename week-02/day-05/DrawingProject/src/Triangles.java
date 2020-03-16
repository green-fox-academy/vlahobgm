import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {
    public static void mainDraw(Graphics graphics){

        /*int x [] = {WIDTH/2,WIDTH/2-30,WIDTH/2+30};
        int y [] = {HEIGHT/2,HEIGHT/2+50,HEIGHT/2+50};
        */
        //graphics.drawPolygon(x,y,3);
        //Math.sqrt()
        double line = Math.sqrt(3)/2;
        int length = WIDTH/21;
        int x = WIDTH/2;
        int y = HEIGHT/4;

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < 21; j++) {
                graphics.drawLine(x+length*j, y, (x - length / 2)+length*j, (int) (y + length * line));
                graphics.drawLine((x - length / 2)+length*j, (int) (y + length * line), (x + length / 2)+length*j, (int) (y + length * line));
                graphics.drawLine((x + length / 2)+length*j, (int) (y + length * line), x+length*j, y);

            }
            x = x - length / 2;
            y = (int) (y + length * line);
        }

    }


    // Don't touch the code below
    static int WIDTH = 400;
    static int HEIGHT = 500;

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