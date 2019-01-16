package oop.lessons_16;

public class Test {

    public static void main(String[] args) {

        Swimable turtle1 = new Turtle();
        Tutlable turtle2 = new Turtle();
        Swimable turtle3 = new Turtle();

        EggFutable chicken1 = new Chicken();


        Contener contener = new Contener(turtle1,chicken1);
        //System.out.println(contener);

        System.out.println(contener.getSwimable());


    }
}
