//import java.util.List;

public class Main {
    public static void main(String[] args) {
        Board.initBoard();
        Board.printBoard();
        // Piece piece = Board.cellNameToPiece("7A");
        // System.out.println(piece);
        // System.out.println(piece.canMove(Board.cellNameToLocation("6A")));
        Piece piece = Board.cellNameToPiece("4D");
        System.out.println(piece);
        System.out.println(piece.canMove(Board.cellNameToLocation("8H")));
    }
}
