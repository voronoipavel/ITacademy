package oop.lessons_19;

public class Test {
    public static void main(String[] args)  {
        errorThrow(22);
    }
    public static void errorThrow(int a){
        System.out.println(Math.sqrt(a));
        if ((Math.sqrt(a)) != (int)(Math.sqrt(a)))
            throw new Error();
    }
}
