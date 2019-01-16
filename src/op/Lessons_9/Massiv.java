package op.Lessons_9;

public class Massiv {
    public static void main(String[] args) {
        int n = 50;
        int y = 15;
        int inputArray[] = new int[n];

        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = (int) (Math.random() * 20);
        }
        for (int i : inputArray) {
            System.out.println(i);
        }
        for (int i = 0; i < inputArray.length-1; i++) {
            if ((inputArray[i] + inputArray[i + 1]) == y) {
                System.out.println("Ok");
            } else {
                System.out.println("Error");
            }
        }
    }
}


