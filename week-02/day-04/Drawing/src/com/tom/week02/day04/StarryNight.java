package com.tom.week02.day04;

import java.util.Random;
import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class StarryNight {
  public static void drawImage(Graphics graphics) {
    // Draw the night sky:
    //  - The background should be black
    //  - The stars can be small squares
    //  - The stars should have random positions on the canvas
    //  - The stars should have random color (some shade of grey)

    drawTheNightSky(graphics);
  }

  private static void drawTheNightSky(Graphics g) {
    g.setColor(Color.black);
    g.fillRect(0, 0, WIDTH, HEIGHT);

    for (int i = 0; i < 1000; i++) {
      g.setColor(Color.getHSBColor(0.0f, 0.0f, (float) Math.random()));
      g.fillRect((int)(Math.random() * WIDTH), (int)(Math.random() * HEIGHT), 1, 1);
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
      drawImage(graphics);
    }
  }
}