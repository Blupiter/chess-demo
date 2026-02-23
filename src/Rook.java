import java.util.List;

public class Rook extends Piece {
    public Rook(int row, int column, String color) {
        super(row, column, color);
        this.icon = 'R';
    }

    public List<Move> getMoves() {
        return null;
    }
}
