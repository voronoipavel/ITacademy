package oop.lessons_12;

public class ChessTest {
    public static void main(String[] args) {
        ChessBoard chessBoard = new ChessBoard();
        /*
        for (int i = 0; i < chessBoard.array.length; i++) {
            for (int j = 0; j < chessBoard.array[i].length; j++) {
                Rectangle rectangle = new Rectangle(new LocationOfFigure(10,10),50,50);
                chessBoard.populate(i,j,rectangle);
                System.out.println(rectangle.speak());
            }
        }
        */
        System.out.println(Rectangle.count);
    }
}
