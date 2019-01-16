package oop.lessons_12;

import javax.swing.*;
import java.awt.*;

public class Test extends Canvas {

    public void paint(Graphics graphics) {

        ChessBoard chessBoard = new ChessBoard();
        graphics.setColor(Color.BLUE);
        graphics.fillRect(45, 45, 570, 570);
        String array[] = {"A", "B", "C", "D", "E", "F", "G", "H"};
        //Color newColor = new Color(85, 75, 42);


        LocationOfFigure locationOfFigure = new LocationOfFigure(50,50);
        Circle circle1 = new Circle(locationOfFigure, Color.RED, 50);
        Checker checker = new Checker(circle1,0,4);

        checker.place("f8");

        System.out.println(checker.getCircle().getLocation().getX());

        for (int i = 0; i < chessBoard.array.length; i++){
            for (int j = 0; j < chessBoard.array[i].length; j++) {

                if (j == 0) {
                    graphics.setColor(Color.RED);
                    graphics.drawString(array[i], i * 70 + 80, j * 70 + 40);
                }
                if (j == 7) {
                    graphics.setColor(Color.BLACK);
                    graphics.drawString(array[i], i * 70 + 80, j * 70 + 140);
                }
                if (i == 0) {
                    graphics.setColor(Color.RED);
                    graphics.drawString(String.valueOf(j + 1), i * 70 + 30, j * 70 + 90);
                }
                if (i == 7) {
                    graphics.setColor(Color.BLACK);
                    graphics.drawString(String.valueOf(j + 1), i * 70 + 130, j * 70 + 90);
                }

                LocationOfFigure locationOfFigure1 = new LocationOfFigure(i * 70 + 50, j * 70 + 50);
                //Figure figure = new Figure(locationOfFigure1, Color.DARK_GRAY, true);
                Rectangle rectangle = new Rectangle(locationOfFigure1, 70, 70);
                Circle circle = new Circle(locationOfFigure1,40);
                chessBoard.populate(i, j, rectangle);

                if ((j % 2 != 0 && i % 2 == 0) || (j % 2 == 0 && i % 2 != 0)) {
                    graphics.setColor(Color.BLACK);
                    graphics.fillRect(locationOfFigure1.getX(), locationOfFigure1.getY(), rectangle.getWidth(), rectangle.getHeight());

                    /*
                    if (j < 3) {

                        graphics.setColor(Color.BLUE);
                        graphics.fillOval(locationOfFigure1.getX() + 15, locationOfFigure1.getY() + 15, circle.getRadius(), circle.getRadius());
                    }
                    if (j > 4) {

                        graphics.setColor(Color.GREEN);
                        graphics.fillOval(locationOfFigure1.getX() + 15, locationOfFigure1.getY() + 15, circle.getRadius(), circle.getRadius());
                    }
                    */

                } else {
                    graphics.setColor(Color.WHITE);
                    graphics.fillRect(locationOfFigure1.getX(), locationOfFigure1.getY(), rectangle.getWidth(), rectangle.getHeight());
                }
                System.out.println(rectangle.speak());
            }
        }
        for (int i = 0; i < chessBoard.array.length; i++) {
            for (int j = 0; j < chessBoard.array[i].length; j++) {

            }
        }

        for (int i = 0; i < chessBoard.checkerArray1.length; i++) {
            for (int j = 0; j < chessBoard.checkerArray1.length; j++) {
                Circle circle = new Circle(locationOfFigure, Color.RED, 50);
                Checker checker1 = new Checker(circle1, i, j);
            }
        }
        graphics.setColor(checker.getCircle().getColor());
        graphics.fillOval(checker.getI(),checker.getJ(),checker.getCircle().getRadius(),checker.getCircle().getRadius());
        System.out.println(Rectangle.count);
        System.out.println(Circle.count);
        System.out.println(Checker.count);
        System.out.println(checker.getI() + " " + checker.getJ());
    }

    public static void main(String[] args) {
        Test canvas = new Test();
        JFrame frame = new JFrame();
        frame.setSize(700, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.getContentPane().add(canvas);
        frame.setVisible(true);
    }
}