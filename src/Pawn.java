public class Pawn extends Piece {
    public Pawn(int row, char column, String color) {
        super(row, column, color);
        this.icon = 'P';
        this.allowedTraversal = 1;
    }
}
