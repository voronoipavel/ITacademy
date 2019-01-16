package op.Lessons_8;

public class ClassWork1 {

    public static void main(String[] args) {
        int inputArray[] = new int[50];
        int outputArray[] = new int[10];
        int count = 0;
        int arrayIndex = 0;
        int max = 0;
        int max2 = 100;

        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = (int) (Math.random() * 100);
        }

        while (arrayIndex < outputArray.length) {

            for (int i = 0; i < inputArray.length; i++) {
                if (max < inputArray[i]) {
                    max = inputArray[i];
                }

                   // max2 = max;

            }
            if (max < max2) {

                outputArray[arrayIndex] = max;
                max2 = max;
                arrayIndex++;
            }
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