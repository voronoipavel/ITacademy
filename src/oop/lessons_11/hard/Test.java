package oop.lessons_11.hard;


import java.awt.*;
import javax.swing.*;

public class Test extends Canvas {
    public Test() {
    }

    public static final double PI_C = 3.14;
    public void paint(Graphics graphics) {
        Circle circle[] = new Circle[3];
        circle[0].drawCircle(graphics,Color.RED,50,100, 50, "Blue");
        circle[1].drawCircle(graphics,Color.RED,30,200, 50, "Red");
        circle[2].drawCircle(graphics,Color.green,40,150, 30, "Green");
    }

    public static void main(String[] args) {
        Test canvas = new Test();
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.getContentPane().add(canvas);
        frame.setVisible(true);
    }

    static void drawCircle(Graphics graphics, Color color,
                           int radius, int x, int y, String rusColor){
        graphics.setColor(color); // Нас интересует только этот блок,
        graphics.fillOval(x, y, radius, radius); // Остальное магия…
        System.out.printf("%s площадь = %s , длина = %s",
                rusColor, Test.PI_C * Math.pow(radius, 2), 2*PI_C*radius);
    }
}
class Circle{
    void drawCircle(Graphics graphics, Color color,
                    int radius, int x, int y, String rusColor){
        /*
        switch (color){
            case 1 : color = Color.RED;
            break;
            case 2 : color =
        }
        */
        graphics.setColor(color); // Нас интересует только этот блок,
        graphics.fillOval(x, y, radius, radius); // Остальное магия…
        System.out.printf("%s площадь = %s , длина = %s",
                rusColor, Test.PI_C * Math.pow(radius, 2), 2 * Test.PI_C * radius);

    }


}