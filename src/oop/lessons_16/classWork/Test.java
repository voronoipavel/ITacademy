package oop.lessons_16.classWork;

public class Test {
    public static void main(String[] args) {
        Swimmable turtle = new Turtle();
        ((Turtle) turtle).name = "Marta";
        Eggable chicken = new Chicken();
        MyContainer myContainer = new MyContainer(turtle, chicken);
        System.out.println(((Turtle)myContainer.getSwimmable()).name);
    }
}
