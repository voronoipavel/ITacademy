package oop.lessons_11.finals;

import java.awt.*;
import javax.swing.*;

public class CircleTest extends Canvas {
    public CircleTest() {
    }

    public void paint(Graphics graphics) {
        final Circle circleArray[] = new Circle[7];
        int step = 50;
        for (int i = 0; i < circleArray.length; i++){
            circleArray[i] = new Circle((int) (step*2.5), step, step -20, Color.RED);
            drawCircle(graphics, circleArray[i]);
            step *= 1.35;
        }
    }

    public static void main(String[] args) {
        CircleTest canvas = new CircleTest();
        JFrame frame = new JFrame();
        frame.setSize(1200, 750);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.getContentPane().add(canvas);
        frame.setVisible(true);
    }

    static void drawCircle(Graphics graphics, Color color,
                           int radius, int x, int y){
        graphics.setColor(color); // Нас интересует только этот блок,
        graphics.fillOval(x, y, radius, radius); // Остальное магия…
    }

    static void drawCircle(Graphics graphics, Circle circle){
        graphics.setColor(circle.color); // Нас интересует только этот блок,
        graphics.fillOval(circle.x, circle.y, circle.radius, circle.radius); // Остальное магия…

    }
}