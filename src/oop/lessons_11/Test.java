package oop.lessons_11;

import java.awt.*;
import javax.swing.*;

public class Test extends Canvas {

    final static double CONST_PI = 3.14;

    public Test() {
    }


    public void paint(Graphics graphics) {
        /*
        graphics.setColor(Color.BLUE); // Нас интересует только этот блок,
        graphics.fillOval(50, 50, 100, 100); // Остальное магия…
        System.out.println("Цвет Синий Площадь");
        graphics.setColor(Color.RED);
        graphics.fillOval(200, 40, 200, 200); // Остальное магия…
        graphics.setColor(Color.BLUE);

        graphics.fillOval(400, 50, 100, 100); // Остальное магия…
        graphics.fillOval(600, 50, 10, 10); // Остальное магия…
        graphics.setColor(Color.BLUE);
        graphics.fillOval(50, 50, 100, 100); // Остальное магия…
        graphics.fillOval(50, 200, 100, 100); // Остальное магия…
        graphics.fillOval(50, 400, 100, 100); // Остальное магия…

*/
        graphics.fillRect(50,50,50,50);
        //graphics.fillArc(50,50,50,50,0,20);
        graphics.fillRoundRect(50,50,40,70,120,150);
    }

    public static void main(String[] args) {
        Test canvas = new Test();
        JFrame frame = new JFrame();
        frame.setSize(2000, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.getContentPane().add(canvas);
        frame.setVisible(true);
    }
    public void drayCercle(Graphics graphics){

    }
}
