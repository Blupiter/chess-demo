public class King extends Piece {
    public King(int row, char column, String color) {
        super(row,column,color);
        this.icon = 'K';
        this.allowedTraversal = 1;
    }
}
