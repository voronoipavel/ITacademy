package oop.lessons_16.classWork;

public class MyContainer {
    Swimmable swimmable;
    Eggable eggable;

    public MyContainer(Swimmable swimmable, Eggable eggable){
        this.swimmable = swimmable;
        this.eggable = eggable;
    }

    public Swimmable getSwimmable(){
        return this.swimmable;
    }
}
