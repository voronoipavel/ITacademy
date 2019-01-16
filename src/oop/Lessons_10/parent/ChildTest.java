package oop.Lessons_10.parent;

public class ChildTest extends Parent {

    public static String test(){
        return "Я сын";
    }

    public static void main(String[] args) {
        System.out.println(ChildTest.test());
    }
}
