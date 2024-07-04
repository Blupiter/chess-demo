public class Bishop extends Piece{
    public Bishop(int row, char column, String color) {
        super(row, column, color);
        this.icon = 'B';
        this.allowedTraversal = 7;
    }
}
