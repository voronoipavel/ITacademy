package oop.lessons_15;

public class WhiteBoard extends Board {
    public WhiteBoard() {
    }

    @Override
    public boolean write(){
        return true;
    }
    @Override
    public String erase(){
        return "Стерать маркер";
    }
}
