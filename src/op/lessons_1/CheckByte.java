package op.lessons_1;

public class CheckByte {
    public static void main (String args[]){
        byte chislo = 127;

        System.out.println("Это оригинальное число = " + chislo);

        // Компилятор нас "обманул"!
        System.out.println("Это измененное число = " + (chislo + 3));

        chislo = (byte)(chislo + 3);
        System.out.println("Это измененное в байт число = " + chislo);
    }
}
