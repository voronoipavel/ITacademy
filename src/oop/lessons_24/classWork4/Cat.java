package oop.lessons_24.classWork4;

public class Cat {

    boolean catched;

    boolean run(Mouse m){
        this.catched = (int)(Math.random()*2) == 0 ? false : true;
        eat(m);
        return this.catched;
    }

    void eat(Mouse m){

        if(this.catched){
            System.out.println("кушаю");
        } else {
            System.out.println("пью");
        }
    }
}
