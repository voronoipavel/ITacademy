package op.Lessons_7;

public class CharAts {
    public static void main(String[] args) {
        String text = "askJ K F J K                  JF K";
        int countspace = 0;
        System.out.println(text.charAt(3));
        boolean foundYet = false;

        for (int i = 0; i < text.length(); i++) {

            if (text.charAt(i) == ' ' ){
                if (!foundYet){
                    System.out.println("Первый пробел найден по индексу " + i);
                }
                foundYet = true;
                countspace++;
            }
        }
        System.out.println("Символ встречается: " + countspace);
    }
}