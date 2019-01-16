package oop.lessons_24.classWork2;

public class Test {
    public static void main(String[] args) {
        try{
            Me me = new Me();
            me.eatable = new EatableImpl("Хлеб");
            me.walk("Куда-то");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}