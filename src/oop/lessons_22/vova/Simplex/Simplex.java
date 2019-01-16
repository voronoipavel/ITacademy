package oop.lessons_22.vova.Simplex;

class Simplex2 {

     public static void main(String[] args) {
         double[][] table = {{15, 1, 3, 1, 0},
                            {13, 3, 1, 0, 1},
                            {0, -2, -3, 0, 0}};


         double[] result = new double[2];
         double[][] table_result;
         Simplex S = new Simplex(table);
         table_result = S.Calculate(result);

         System.out.println("Решенная симплекс-таблица:");
         for (int i = 0; i < table_result.length; i++) {
             for (int j = 0; j < table_result.length; j++) {
                 System.out.print(table_result[i][j] + "\t ");
             }
             System.out.println();
         }

         System.out.println("Решение:");
         System.out.println("X[1] = " + result[0]);
         System.out.println("X[2] = " + result[1]);
         System.out.println();


     }
     }
