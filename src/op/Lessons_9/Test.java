package op.Lessons_9;

public class Test {
    public static void main(String[] args) {
        int value = 100;
        if (value > 100){
            System.out.println("1");
        }
        else if (value < 100){
            System.out.println("2");
        }
        switch (value){
            case 100: System.out.println("3");
            case 10:  System.out.println("4"); break;
            default:  System.out.println("5");
        }
    }
}
