package op.Lessons_9;

public class Massiv2 {
    public static void main(String[] args) {
        int n = 100;
        int inputArray[] = new int[n];
        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = (int) (Math.random() * 100);
        }
        System.out.println("Первый");
        for (int i : inputArray) {
            System.out.println(i);
        }
        System.out.println("Втортой");
        for (int i = inputArray.length - 1; i > 0; i--) {

            if (inputArray[i] % 2 != 0 || inputArray[i] == 1) {
                System.out.println(inputArray[i]);
            }
        }
    }
}