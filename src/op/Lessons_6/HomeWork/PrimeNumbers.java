package op.Lessons_6.HomeWork;

public class PrimeNumbers {
    public static void main(String[] args) {

        int arrayLength = 50;
        int count = 0;
        int arrayIndex = 0;
        int primesArray[] = new int[arrayLength];

        while (arrayIndex < primesArray.length) {

            boolean isPrimeNumber = true;

            if (count <= 1)
                isPrimeNumber = false;

            for (int i = 2; i * i <= count; i++) {
                if (count % i == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }
            if (isPrimeNumber) {
                primesArray[arrayIndex] = count;
                arrayIndex++;
            }
            count++;
        }
        for (int i : primesArray) {
            System.out.println(i);
        }
    }
}