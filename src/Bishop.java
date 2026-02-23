import java.util.LinkedList;
import java.util.List;

public class Bishop extends Piece{
    public Bishop(int row, int column, String color) {
        super(row, column, color);
        this.icon = 'B';
    }

    public List<Move> getMoves() {
        List<Move> moves = new LinkedList<Move>();
        getMovesHelper(moves, this.location.getRow()+1, this.location.getColumn()+1,1,1);
        getMovesHelper(moves, this.location.getRow()+1, this.location.getColumn()-1,1,-1);
        getMovesHelper(moves, this.location.getRow()-1, this.location.getColumn()+1,-1,1);
        getMovesHelper(moves, this.location.getRow()-1, this.location.getColumn()-1,-1,-1);
        return moves;
    }

    private void getMovesHelper(List<Move> moves, int row, int col, int drow, int dcol) {
        Location attemptedLocation = new Location(row, col);
        if (Board.inBounds(attemptedLocation)) {
            if (!Board.occupied(attemptedLocation)) {
                moves.add(new Move(this, attemptedLocation, false, null));
                getMovesHelper(moves, row+drow, col+dcol, drow, dcol);
            } else {
                Piece otherPiece = Board.getPiece(attemptedLocation);
                if (isEnemy(otherPiece)) {
                    moves.add(new Move(this, attemptedLocation, true, otherPiece));
                }
            }
        }
        return;
    }
}
