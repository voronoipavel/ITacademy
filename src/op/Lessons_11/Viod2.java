package op.Lessons_11;

public class Viod2 {
    public static void main(String[] args) {
        int age;
        int[] ages = {7, 17, 24, 70};

        for (int i = 0; i < ages.length; i++) {
            age = ages[i];

            if (age <= 16) {
                System.out.println("Свидетельство о рождении " + age);
            }
            if (age >= 17 && age < 23) {
                System.out.println("Диплом и паспорт " + age);
            }
            if (age >= 24 && age < 60) {
                System.out.println("Трудовая книжка " + age);
            }
            if (age >= 60) {
                System.out.println("Пенсионное удостоверение " + age);
            }
        }
    }
}
