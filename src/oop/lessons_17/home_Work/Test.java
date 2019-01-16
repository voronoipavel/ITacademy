package oop.lessons_17.home_Work;

public class Test {
    public static void main(String[] args) {

        Animals animals[] = new Animals[15];
        int turtlesIndex = 0;
        int sharksIndex = 0;
        int ducksIndex = 0;

        for (int i = 0; i < animals.length; i++) {
            if (i % 2 == 0) {
                animals[i] = new Duck("Утка" + (ducksIndex + 1));
                ducksIndex++;
            } else if (i % 3 == 0) {
                animals[i] = new Turtle("Черепаха" + (turtlesIndex + 1));
                turtlesIndex++;
            } else {
                animals[i] = new Shark("Акула" + (sharksIndex + 1));
                sharksIndex++;
            }
        }

        Duck ducks[] = new Duck[ducksIndex];
        Shark sharks[] = new Shark[sharksIndex];
        Turtle turtles[] = new Turtle[turtlesIndex];

        for (int i = 0; i < animals.length; i++) {
            if (animals[i] instanceof Shark) {
                sharks[sharksIndex - 1] = (Shark) animals[i];
                sharksIndex--;
            }
            if (animals[i] instanceof Duck) {
                ducks[ducksIndex - 1] = (Duck) animals[i];
                ducksIndex--;
            }
            if (animals[i] instanceof Turtle) {
                turtles[turtlesIndex - 1] = (Turtle) animals[i];
                turtlesIndex--;
            }
        }

        System.out.println("Отсортированный массив черепах");

        for (int i = turtles.length - 1; i >= 0; i--) {
            System.out.println(turtles[i].getName() + " вес - " + turtles[i].getWeight());
        }
        System.out.println("Отсортированный массив акул");
        for (int i = sharks.length - 1; i >= 0; i--) {
            System.out.println(sharks[i].getName() + " вес - " + sharks[i].getWeight());
        }
        System.out.println("Отсортированный массив уток");
        for (int i = ducks.length - 1; i >= 0; i--) {
            System.out.println(ducks[i].getName() + " вес - " + ducks[i].getWeight());
        }

        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i].getName() + " " + Filterable.weighing(animals[i], 3));
        }

        System.out.println(animals[5].speak());
        System.out.println(animals[0].swim());
        System.out.println(animals[1].swim());
        System.out.println(animals[9].speak());
    }
}
