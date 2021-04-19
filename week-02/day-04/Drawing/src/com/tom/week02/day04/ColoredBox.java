package com.tom.week02.day04;

import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ColoredBox {
  public static void drawImage(Graphics g) {
    // Draw a box that has different colored lines on each edge

    g.setColor(Color.red);
    g.drawLine(100, 100, 200, 100);
    g.setColor(Color.green);
    g.drawLine(200, 100, 200, 200);
    g.setColor(Color.blue);
    g.drawLine(200, 200, 100, 200);
    g.setColor(Color.black);
    g.drawLine(100, 200, 100, 100);
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