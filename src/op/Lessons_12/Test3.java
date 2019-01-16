package op.Lessons_12;

public class Test3 {
    public static void main(String[] args) {
        char str[] = {'р', 'а', 'б', 'о', 'т', 'а', 'н', 'е', 'в', 'о', 'л', 'к'};
        char str1[] = new char[20];
        int k = 0;

        boolean flag;
        for (int i = 0; i < str.length; i++) {
            flag = true;
            for (int j = 0; j < str.length; j++) {
                if ((str[j] == str[i]) && (j != i)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                str1[i] = str[i];
            }

        }
        for (int i = 0; i < str1.length; i++) {

            System.out.println(str1[i]);
        }
    }
}

