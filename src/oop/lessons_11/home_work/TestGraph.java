package oop.lessons_11.home_work;

import javax.swing.*;
import java.awt.*;

public class TestGraph extends Canvas {

    public TestGraph() {
    }

    public void paint(Graphics graphics) {

        graphics.setColor(Color.BLACK);
        graphics.drawLine(300, 0, 300, 5000);
        graphics.drawLine(0, 300, 5000, 300);
        graphics.drawString("Y", 325, 10);
        graphics.drawString("X", 560, 315);

        FunctionGraph functionGraphX2 = new FunctionGraph();
        FunctionGraph functionGraphX3 = new FunctionGraph();

        int array[] = new int[FunctionGraph.getLengthArray()];

        for (int i = 0; i < FunctionGraph.getLengthArray(); i++) {
            array[i] = i - 20;
        }
        functionGraphX2.functionX2(array);
        functionGraphX3.functionX3(array);

        for (int i = 0; i < FunctionGraph.getLengthArray(); i++) {
            graphics.fillOval(functionGraphX2.arrayPixelX[i] - 2, functionGraphX2.arrayPixelY[i] - 2, 4, 4);
            graphics.fillOval(functionGraphX3.arrayPixelX[i] - 2, functionGraphX3.arrayPixelY[i] - 2, 4, 4);
        }

        graphics.setColor(Color.RED);
        graphics.drawPolyline(functionGraphX2.arrayPixelX, functionGraphX2.arrayPixelY, FunctionGraph.getLengthArray());
        graphics.drawString("y = x2", 100, 100);

        graphics.setColor(Color.BLUE);
        graphics.drawPolyline(functionGraphX3.arrayPixelX, functionGraphX3.arrayPixelY, FunctionGraph.getLengthArray());
        graphics.drawString("y = x3", 100, 150);

        System.out.println("y = x2");
        for (int i = 0; i < FunctionGraph.getLengthArray(); i++) {
            System.out.println("x = " + functionGraphX2.arrayPixelX[i] + " y = " + functionGraphX2.arrayPixelY[i]);
        }
        System.out.println();
        System.out.println("y = x3");
        for (int i = 0; i < FunctionGraph.getLengthArray(); i++) {
            System.out.println("x = " + functionGraphX3.arrayPixelX[i] + " y = " + functionGraphX3.arrayPixelY[i]);
        }
    }

    public static void main(String[] args) {
        TestGraph canvas = new TestGraph();
        JFrame frame = new JFrame();
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(canvas);
        frame.setVisible(true);
    }
}