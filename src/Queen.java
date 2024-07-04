public class Queen extends Piece {
    public Queen(int row, char column, String color) {
        super(row, column, color);
        this.icon = 'Q';
        this.allowedTraversal = 7;
    }
}
