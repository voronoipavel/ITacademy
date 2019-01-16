package oop.lessons_15;

public class BlackBoard extends Board {
    @Override
    public boolean write(){
        return true;
    }
    @Override
    public String erase(){
        return "Стерать тряпкой";
    }
}
