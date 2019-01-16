package op.Lessons_4;

public class ShortAndLong {

        public static void main(String[] args) {
            boolean isFemale = false;
            if(isFemale && (value() >= 10)){
                System.out.println("Дудумс!");
            }
            System.out.println("Ничего не вызвано!");
        }
        public static int value(){
            System.out.println("Метод вызывается");
            return 10;
        }
    }
