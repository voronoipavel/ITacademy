package op.Lessons_5;

public class While {
    public static void main(String[] args) {
        int namber = 0;
        int count = 0;
        int sum = 0;
        while (count < 3){
             if (namber % 97 == 0 && namber > 0){
                 count ++;
                System.out.println(namber);
                sum = sum + namber;
            }
            namber ++ ;

        }
        System.out.println(sum);
    }
}
