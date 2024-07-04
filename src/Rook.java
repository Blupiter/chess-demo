public class Rook extends Piece {
    public Rook(int row, char column, String color) {
        super(row, column, color);
        this.icon = 'R';
        this.allowedTraversal = 7;
    }
}
