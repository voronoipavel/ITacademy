package oop.lessons_1;

public class qqq {

        public static void main(String[] args) {
            System.out.println(method(1, 100));
        }
        static int method(int from, int before) {
            int summ = 0;
            int summ1 = 0;
            int summ2 = 0;

            for (int i = from; i <= before; i++) {
                if (i % 3 == 0) {
                    summ = summ + i;
                }
                if (i % 4 == 0) {
                    summ1 = summ1 + i;
                }
                summ2 = summ + summ1;
            }
            return summ2;
        }
}
