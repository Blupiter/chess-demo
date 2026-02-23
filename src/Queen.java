import java.util.List;

public class Queen extends Piece {
    public Queen(int row, int column, String color) {
        super(row, column, color);
        this.icon = 'Q';
    }

    public List<Move> getMoves() {
        return null;
    }
}
