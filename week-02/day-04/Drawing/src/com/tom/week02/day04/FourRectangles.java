package com.tom.week02.day04;

import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

  public static void drawImage(Graphics graphics) {
    // Draw four different size and color rectangles
    // Avoid code duplication!

    for (int i = 0; i < 5; i++) {
      drawSquare(i * 50, i * 10, i*10, graphics);
    }
  }

  private static void drawSquare(int x, int y, int size, Graphics g) {
    g.setColor(new Color((int) (Math.random() * 0x1000000)));
    g.drawRect(x, y, size, size);
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
      drawImage(graphics);
    }
  }
}