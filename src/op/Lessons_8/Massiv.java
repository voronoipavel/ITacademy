package op.Lessons_8;

public class Massiv {
    public static void main(String[] args) {
        int inputArray[] = new int[200];
        int outputArray[] = new int[10];
        //int arrayLength;
        //int max = 0;
        int count = 0;
        //int max2 = 100;

        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = (int) (Math.random() * 100);
        }
        int max = 0;
        for (int i = 0; i < outputArray.length; i++) {
            outputArray[i] = inputArray[0];
        }
        for (int i = 0; i < outputArray.length; i++) {
            for (int j = 0; j < inputArray.length; j++) {
                if (outputArray[i] < inputArray[j]) {
                    outputArray[i] = inputArray[max = j];
                }
            }
            inputArray[max] = Integer.MIN_VALUE;
        }
            System.out.println("Первый");
            for (int i : inputArray) {
                System.out.println(i);
            }
            System.out.println("Второй");
            for (int i : outputArray) {
                System.out.println(i);
            }
        }
}

