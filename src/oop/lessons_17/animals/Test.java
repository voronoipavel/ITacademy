package oop.lessons_17.animals;

public class Test {

    public static void main(String[] args) {
        Aquarium aquarium = new Aquarium();
        aquarium.swimable = new Swimable[15];

        for (int i = 0; i < aquarium.getSwimable().length; i++) {
            if (i < 5) {
                aquarium.getSwimable()[i] = new Turtle();
            } else if (i < 10) {
                aquarium.getSwimable()[i] = new Shark();
            } else if (i < 15) {
                aquarium.getSwimable()[i] = new Duck();
            }
        }
        //aquarium.getSwimable()[5] = null;
        for (int i = 0; i < aquarium.getSwimable().length; i++) {
            if (aquarium.getSwimable()[i] instanceof Shark) {
                ((Shark) aquarium.getSwimable()[i]).hunt();
            }
        }

        /*
        for (Swimable str : aquarium.getSwimable()) {
            str.makeSounds();
        }
        */

        Turtle turtles[] = new Turtle[5];
        Shark sharks[] = new Shark[5];
        Duck ducks[] = new Duck[5];

        int turtlesIndex = 0;
        int sharksIndex = 0;
        int ducksIndex = 0;
        for (int i = 0; i < aquarium.getSwimable().length; i++) {

            if (aquarium.getSwimable()[i] instanceof Shark) {
                sharks[sharksIndex] = (Shark) aquarium.getSwimable()[i];
                sharksIndex++;
            }
            if (aquarium.getSwimable()[i] instanceof Turtle) {
                turtles[turtlesIndex] = (Turtle) aquarium.getSwimable()[i];
                turtlesIndex++;
            }
            if (aquarium.getSwimable()[i] instanceof Duck) {
                ducks[ducksIndex] = (Duck) aquarium.getSwimable()[i];
                sharksIndex++;
            }
        }

    }
}
