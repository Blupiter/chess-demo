import java.util.List;

public class Knight extends Piece{
    public Knight(int row, int column, String color) {
        super(row, column, color);
        this.icon = 'H';
    }

    public List<Move> getMoves() {
        return null;
    }
}
