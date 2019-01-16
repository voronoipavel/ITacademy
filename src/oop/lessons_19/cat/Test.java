package oop.lessons_19.cat;

public class Test {

    public static void main(String[] args) {

        array(11);
        array(10);
    }
    public static void array (int index) throws NullPointerException, ArrayIndexOutOfBoundsException {

        try {
            Cat cat[] = new Cat[10];
            for (int i = 0; i < cat.length; i++) {
                cat[i] = new Cat("Cat " + String.valueOf(i + 1));
            }
            cat[9] = null;
            for (int i = 0; i < index; i++) {
                System.out.println(cat[i].getName());
            }
        }
        catch (NullPointerException ex){
            System.out.println("поймали!");
            ex.printStackTrace();
        }
        catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Опять поймали!");
            ex.printStackTrace();
        }

        finally {
            System.out.println("УУУУУ");
        }


    }
}
