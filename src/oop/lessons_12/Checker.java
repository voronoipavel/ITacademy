package oop.lessons_12;

public class Checker {

    Circle circle;
    int i;
    int j;
    static int count;


    public Checker(){
    }

    public Checker(Circle circle) {
        this.circle = circle;
    }

    public Checker(Circle circle, int i, int j) {
        this.circle = circle;
        this.i = i * 70 + getCircle().getLocation().getX() + 10;
        this.j = j * 70 + getCircle().getLocation().getY() + 10;
        count++;
    }

    public Checker(int i, int j) {
        this.i = i * 70 + getCircle().getLocation().getX();
        this.j = j * 70 + getCircle().getLocation().getY();
    }

    public Circle getCircle() {
        return circle;
    }


    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }

    public void place(String location){

        String arrayString[] = {"A", "B", "C", "D", "E", "F", "G", "H"};
        for (int k = 0; k < arrayString.length; k++) {
            if (String.valueOf(location.charAt(0)).equalsIgnoreCase(arrayString[k])){
                this.i = k * 70 + getCircle().getLocation().getX() + 10;
            }
        }
        this.j = ((Character.digit(location.charAt(1),10)) - 1) * 70 + getCircle().getLocation().getY() + 10;
    }

}
