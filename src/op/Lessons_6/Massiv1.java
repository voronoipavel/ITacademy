package op.Lessons_6;

public class Massiv1 {
    public static void main(String[] args) {

        String massiv[] = new String[20];
        String a = "A";
        for (int i = 0; i < massiv.length; i++) {
            massiv[i] = a;
            a += "A";
            //System.out.println(a);
        }
        for (String i : massiv) {
            System.out.println(i);
        }
    }
}

