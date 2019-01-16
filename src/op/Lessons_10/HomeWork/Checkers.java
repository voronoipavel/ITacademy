package op.Lessons_10.HomeWork;

public class Checkers {
    public static void main(String[] args) {
        String list[][] = new String[8][8];
        String x = "X", o = "O";
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (i != 3 && i != 4) {
                    if (j % 2 != 0 && i % 2 == 0) {
                        list[i][j] = x;
                    } else { // Вот здесь вопрос если поставить после следующего if то выводит не так почему не пойму
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
        System.out.println();
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.printf("%3s", list[i][j]);
            }// Это всё на что у меня хватило фантазии. Если честно, то я ничего не понял
            System.out.println();
        }
    }
}
