package oop.lessons_4.class_work1;

public class Test {
    public static void main(String[] args) {
        int length = 0;
        int j = 0;

        Circle circle1 = new Circle(3);
        Circle circle2 = new Circle(6, "Red");
        Circle circle3 = new Circle(7, "Red", true);
        //circle1.setRadius(3);
        //System.out.println(circle1.square());
        /*System.out.println(circle1.getRadius());
        System.out.println(circle1.length());
        System.out.println(circle1.square());
        System.out.println(circle1.increaseRadius(2));
        System.out.println(circle1.getRadius());
        System.out.println(circle1.length());
        System.out.println(circle1.square());*/
        //circle3.info();

        circle1.length();
        circle1.square();
        circle1.info();
        circle1.increasedRadius(2);

        circle1.length();
        circle1.square();
        circle1.info();

        circle2.length();
        circle2.square();
        circle2.info();

        circle3.length();
        circle3.square();
        circle3.info();

        Circle circleOne[] = new Circle[100];
        for (int i = 0; i < circleOne.length; i++) {
            circleOne[i] = new Circle((int)((Math.random() * 99 + 1)));
            if (circleOne[i].getRadius() % 3 == 0){
               length++;
           }
        }
        Circle circleTwo[] = new Circle[length];
        for (int i = 0; i < circleOne.length; i++) {
            if (circleOne[i].getRadius() % 3 == 0){
                circleTwo[j] = new Circle(circleOne[i].getRadius());
                j++;
            }
        }
        for (int i = 0; i < circleTwo.length; i++) {
            System.out.println(circleTwo[i].getRadius());
        }
    }
}
