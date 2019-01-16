package oop.lessons_3;

public class Test {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle();
        rectangle.setLength(-3);
        rectangle.setWidth(5);
        rectangle1.setWidthAndWidth(3.5, 5.6);
        rectangle2.setSquare(4);

        Rectangle rectangle4 = new Rectangle(12, 14);

        rectangle2.setColor("Red");

        /*rectangle.setLength(10);
        rectangle.setWidth(15);*/

        /*System.out.println(rectangle.getLength());
        System.out.println(rectangle.getWidth());*/
        //System.out.println(rectangle.width);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle1.getArea());
        System.out.println(rectangle2.getArea());
        System.out.println(rectangle2.getInfo());


        //System.out.println(rectangle.getArea());
    }


}
