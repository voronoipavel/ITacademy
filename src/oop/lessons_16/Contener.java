package oop.lessons_16;

public class Contener {
    Swimable swimable;
    EggFutable delable;

    public Contener(Swimable swimable, EggFutable delable) {
        this.swimable = swimable;
        this.delable = delable;
    }

    public Swimable getSwimable(){
        return this.swimable;
    }
}
