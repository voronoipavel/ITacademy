package op.Lessons_8;

public class ClassWork2 {
    public static void main(String[] args) {
        int inputArray[] = new int[200];
        int outputArray[] = new int[10];
        int count = 0;
        int arrayIndex = 0;

        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = (int) (Math.random() * 100);
        }
        while (arrayIndex < outputArray.length) {
            boolean isPrimeNumber = true;
            if (inputArray[count] <= 1) {
                isPrimeNumber = false;
            }
            for (int i = 2; i * i <= inputArray[count]; i++) {
                if (inputArray[count] % i == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }
            if (isPrimeNumber) {
                outputArray[arrayIndex] = inputArray[count];
                arrayIndex++;
            }
            count++;
        }
        System.out.println("Первый");
        int index = 0;
        for (int i : inputArray) {
            System.out.printf("№ = %d - %d \n", ++index, i);
        }
        System.out.println("Второй");
        index = 0;
        for (int i : outputArray) {
            System.out.printf("№ = %d - %d \n", ++index, i);
        }
    }
}