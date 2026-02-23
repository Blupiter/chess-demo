import java.util.List;

public class Bishop extends Piece{
    public Bishop(int row, int column, String color) {
        super(row, column, color);
        this.icon = 'B';
    }

    public List<Move> getMoves() {
        return null;
    }
}
