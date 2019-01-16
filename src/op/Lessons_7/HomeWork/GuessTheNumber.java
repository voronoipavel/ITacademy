package op.Lessons_7.HomeWork;

public class GuessTheNumber {

    public static void main(String[] args) {
        int value = (int) (Math.random() * 1000), min = 0, max = 1000, count = 0, middle;
        while (true) {
            middle = min + (max - min) / 2;
            if (value > middle) {
                min = middle;
            }
            if (value < middle) {
                max = middle;
            }
            if (value == middle) {
                System.out.println("Задуманное число: " + middle + " Количество попыток: " + count);
                break;
            }
            count++;
        }
    }
}
