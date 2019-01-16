package oop.lessons_22.vova.vova1;

public class Program {

    public static void main(String[] args) {
        double[][] table = {
                {15, 1, 3, 1, 0},
                {13, 3, 1, 0, 1},
                {0, -2, -3, 0, 0}
        };

        double[] result = new double[2];
        double[][] table_result;
        Simplex simplex = new Simplex(table);
        table_result = simplex.Calculate(result);

        System.out.println("Решенная симплекс-таблица:");
        for (int i = 0; i < table_result.length; i++) {
            for (int j = 0; j < table_result[0].length; j++)
                if (table_result[i][j] % 1 == 0) {
                    System.out.print((int) table_result[i][j] + "    ");
                } else {
                    System.out.print(table_result[i][j] + "    ");
                }
            System.out.println();
        }

        System.out.println();
        System.out.println("Решение:");
        System.out.println("X[1] = " + (int) result[0]);
        System.out.println("X[2] = " + (int) result[1]);
        System.out.println();
    }

}
