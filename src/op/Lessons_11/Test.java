package op.Lessons_11;

public class Test {
    public static void main(String[] args) {
        String list[][] = new String[8][8];
        String x = "X", o = "O";
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (i != 3 && i != 4) {
                    if (j % 2 != 0 && i % 2 == 0) {
                        list[i][j] = x;
                    } else {
                        list[i][j] = o;
                    }
                    if (j % 2 == 0 && i % 2 != 0) {
                        list[i][j] = x;
                    }
                } else {
                    list[i][j] = o;
                }
            }
        }
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(" " + list[i][j]);
            }
            System.out.println();
        }
    }
}
