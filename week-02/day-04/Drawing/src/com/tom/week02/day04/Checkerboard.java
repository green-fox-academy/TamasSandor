package com.tom.week02.day04;

import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {
  public static void drawImage(Graphics graphics) {
    // Fill the canvas with a checkerboard pattern

    for (int i = 0; i < 8; i++) {
      for (int j = 0; j < 8; j++) {
        drawSquare(i, j, graphics);
      }
    }
  }

  private static void drawSquare(int x, int y, Graphics g) {
    if ((x + y) % 2 == 0) {
      g.setColor(Color.white);
    } else {
      g.setColor(Color.black);
    }
    g.fillRect(x * (WIDTH / 8), y * (HEIGHT / 8), WIDTH / 8, HEIGHT / 8);
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