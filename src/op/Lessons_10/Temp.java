package op.Lessons_10;

public class Temp {
    public static void main(String[] args) {

        int matr[][] = new int[10][10];
        int value = 0;
        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr.length; j++) {
                matr[i][j] = value++;
                System.out.print(" " + matr[i][j]);
            }
            System.out.println();
        }
        System.out.println(value);
    }
}
