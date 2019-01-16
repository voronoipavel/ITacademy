package oop.lessons_13.task_13;

public class Test {
    public static void main(String[] args) {
        Pepperoni pepperoni1 = new Pepperoni("Pepperoni1", 250,300,true);
        Pepperoni pepperoni2 = new Pepperoni("Pepperoni2", 250,300,false);
        Margarita margarita = new Margarita("Margarita", 300,200,true);
        LaFinta laFinta = new LaFinta("LaFinta", 250,400,false);

        pepperoni1.deliver();
        margarita.deliver();
        laFinta.deliver();
        margarita.cook();



    }
}
