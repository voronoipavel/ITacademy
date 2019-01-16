package oop.lessons_11.home_work;

import javax.swing.*;
import java.awt.*;

public class Test extends Canvas {


    public Test() {
    }

    public void paint(Graphics graphics) {
        graphics.drawLine(300, 0, 300, 5000);
        graphics.drawLine(0, 300, 5000, 300);
        graphics.drawString("Y", 325, 10);
        graphics.drawString("X", 560, 315);

        int lengthArray = 51;
        int[] arrayX = new int[lengthArray];
        int[] arrayY = new int[lengthArray];
        int[] arrayPixelX = new int[lengthArray];
        int[] arrayPixelY = new int[lengthArray];
        int n = 300;
        for (int i = 0; i < lengthArray; i++) {
            arrayX[i] = (i - 25);
            arrayY[i] = -(int) Math.pow(arrayX[i], 2);
            arrayPixelX[i] = arrayX[i] + n;
            arrayPixelY[i] = arrayY[i] + n;
            graphics.fillOval(arrayPixelX[i] - 2, arrayPixelY[i] - 2,4,4);
        }
        graphics.setColor(Color.RED);
        graphics.drawPolyline(arrayPixelX, arrayPixelY, arrayX.length);
        graphics.drawString("y = x * x", 100, 100);

        graphics.setColor(Color.BLACK);

        for (int i = 0; i < lengthArray; i++) {
            arrayX[i] = (i - 25);
            arrayY[i] = -(int) Math.pow(arrayX[i], 3);
            arrayPixelX[i] = arrayX[i] + n;
            arrayPixelY[i] = arrayY[i] + n;
            graphics.fillOval(arrayPixelX[i] - 2, arrayPixelY[i] - 2,4,4);
        }

        graphics.setColor(Color.BLUE);
        graphics.drawPolyline(arrayPixelX, arrayPixelY, arrayX.length);
        graphics.drawString("y = x * x * x", 100, 150);
    }

    public static void main(String[] args) {
        Test canvas = new Test();
        JFrame frame = new JFrame();
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(canvas);
        frame.setVisible(true);
    }

}
