package op.Lessons_8;

public class ClassWork4 {
    public static void main(String[] args) {
        int inputArray[] = new int[200];
        int outputArray[] = new int[10];
        int count = 0;
        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = (int) (Math.random() * 100);
        }
        for (int i = 0; i < inputArray.length - 1; i++) {
            if (count < outputArray.length) {
                if ((inputArray[i] + inputArray[i + 1]) % 5 == 0) {
                    outputArray[count] = (inputArray[i] + inputArray[i + 1]);
                    count++;
                }
            } else break;
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