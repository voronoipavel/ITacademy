package op.lessons_1;

public class CheckInteger {
    public static void main(String args[]){
        int intValue = 4;
        long longValue = 4;
        //intValue = longValue + 2;
        intValue = (int)(longValue + 2);
        longValue = intValue + 2;
        System.out.println("intValue " + intValue);
        System.out.println("longValue " + longValue);
    }
}
