package oop.lessons_11.home_work;

public final class FunctionGraph {

    private final static int lengthArray = 41;
    private int arrayY[] = new int[lengthArray];
    final int arrayPixelX[] = new int[lengthArray];
    final int arrayPixelY[] = new int[lengthArray];
    private int n = 300;

    public void functionX2(int arrayX[]){
        for (int i = 0; i < lengthArray; i++) {
            this.arrayY[i] = -((int) Math.pow(arrayX[i], 2));
            locationPixelXY(arrayX, this.arrayY);
        }
    }

    public void functionX3(int arrayX[]){
        for (int i = 0; i < lengthArray; i++) {
            this.arrayY[i] = -(int) Math.pow(arrayX[i], 3);
            locationPixelXY(arrayX, this.arrayY);
        }
    }

    private void locationPixelXY(int arrayX[], int arrayY[]){
        for (int i = 0; i < lengthArray; i++) {
            this.arrayPixelX[i] = arrayX[i] + n;
            this.arrayPixelY[i] = arrayY[i] + n;
        }
    }

    public static int getLengthArray() {
        return lengthArray;
    }
}
