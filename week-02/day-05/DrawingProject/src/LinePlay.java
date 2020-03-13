import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {
    public static void mainDraw(Graphics graphics){
        //1 XP Divide the canvas into 4/16/64 equal parts and repeat the line play pattern in each quarter
        for (int i = 1; i < 15; i++) {
            graphics.setColor(Color.GREEN);
            graphics.drawLine(5,40+(HEIGHT-40)/15*i,WIDTH/15*i, HEIGHT-5);
        }
        for (int i = 1; i < 15; i++) {
            graphics.setColor(new Color(128,0,128));
            graphics.drawLine(40+(WIDTH-40)/15*i,5,WIDTH-5, HEIGHT/15*i);
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