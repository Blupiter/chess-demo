//import java.util.List;

public class Main {
    public static void main(String[] args) {
        Board.initBoard();
        Board.printBoard();
        Piece piece = Board.cellNameToPiece("1B");
        System.out.println(piece);
        if (piece.move("3A")) {
            System.out.println("Success");
            Board.printBoard();
        } else {
            System.out.println("Invalid");
        }
    }
}
