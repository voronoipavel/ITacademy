package oop.lessons_12;

public class ChessBoard {

    final Checker checkerArray1[] = new Checker[12];
    final Checker checkerArray2[] = new Checker[12];

    final Rectangle array[][] = new Rectangle[8][8];

    public final void populate(int x, int y, Rectangle rectangle){
        array[x][y] = rectangle;
    }
}
