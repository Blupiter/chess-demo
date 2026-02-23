import java.util.List;

public class Main {
    public static void main(String[] args) {
        Board.initBoard();
        Board.printBoard();
        // Piece piece = Board.cellNameToPiece("7A");
        // System.out.println(piece);
        // System.out.println(piece.canMove(Board.cellNameToLocation("6A")));
        Piece king = Board.cellNameToPiece("8E");
        System.out.println(king);
        System.out.println(king.canMove(Board.cellNameToLocation("7E")));
    }
}
