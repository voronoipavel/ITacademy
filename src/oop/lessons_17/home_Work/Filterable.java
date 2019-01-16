package oop.lessons_17.home_Work;

public interface Filterable {

    static String weighing(Animals animals, int n){
        if (animals.getWeight() < n) {
            return "Недовес надо подкормить";
        }
        return "С весом все впорядке";

    }
}
