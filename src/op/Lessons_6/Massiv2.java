package op.Lessons_6;

public class Massiv2 {
    public static void main(String[] args) {

        int massiv[] = new int[100];
        int value = 1;
        for (int i = 0; i < massiv.length; i++) {
            massiv[i] = value;
            value += 3;
        }
        for (int i : massiv) {
            System.out.println(i);
        }
    }
}
