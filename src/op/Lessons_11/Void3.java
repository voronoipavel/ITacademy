package op.Lessons_11;

public class Void3 {
    public static void main(String[] args) {
       setSizeArray(1000);
        }


    static void showMyDocument (int age) {
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
    static void setSizeArray (int quantity){
        int[] ages = new int[quantity];
        for (int i = 0; i < ages.length; i++) {
            ages[i] = (int) (Math.random() * 90);
            showMyDocument(ages[i]);
        }

    }
}
