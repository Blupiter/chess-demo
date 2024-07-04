public class Knight extends Piece{
    public Knight(int row, char column, String color) {
        super(row, column, color);
        this.icon = 'H';
        this.allowedTraversal = 1;
    }
}
