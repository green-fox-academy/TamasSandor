package com.tom.week02.day04;

import java.util.Random;
import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBox {
  public static void drawImage(Graphics graphics) {
    // Create a square drawing function that takes 3 parameters
    // (the square size, the fill color and the graphics)
    // and draws a square of that size and color to the center of the canvas.
    // Create a loop that fills the canvas with rainbow colored squares (red, orange, yellow, green, blue, indigo, violet).

    Color[] rainbow = {Color.red, Color.orange, Color.yellow, Color.green, Color.blue,
        Color.decode("#4B0082") /* indigo */, Color.decode("#7f00ff")/* violet */};

    for (int i = 0; i <= WIDTH; i++) {
      drawSquare(i, getRandom(rainbow), graphics);
    }
  }

  private static void drawSquare(int size, Color color, Graphics g) {
    g.setColor(color);
    g.drawRect(WIDTH / 2 - (size / 2), HEIGHT / 2 - (size / 2), size, size);
  }

  private static Color getRandom(Color[] colors) {
    Random rand = new Random();
    return colors[rand.nextInt(colors.length)];
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