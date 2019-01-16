package op.Lessons_6;

public class Massiv {
    public static void main(String[] args) {

        int massiv[] = new int[100];
        int value = 1;
        for (int i = 0; i < massiv.length; i++) {
            massiv[i] = value;
            value += 3;

        }
        for (int i = massiv.length -1; i > 0; i--) {
            System.out.println(massiv[i]);

        }


    }
}
