package oop.lessons_17.animals;

public class Aquarium {

    public Swimable swimable[];
    private Weightable weightable;

    public Swimable[] getSwimable() {
        return swimable;
    }

    public Weightable getWeightable() {
        return weightable;
    }

    public void cleaningAquarium() {
        swimable = null;
    }

    public void setWeightable(Weightable weightable) {
        this.weightable = weightable;
    }
}
