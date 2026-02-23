import java.util.LinkedList;
import java.util.List;

public class King extends Piece {
    public King(int row, int column, String color) {
        super(row,column,color);
        this.icon = 'K';
    }

    // FIX THIS
    public List<Move> getMoves() {
        List<Move> moves = new LinkedList<Move>();
        List<Location> attempts = new LinkedList<>();
        // lateral moves
        attempts.add(new Location(location.getRow()+1, location.getColumn()));
        attempts.add(new Location(location.getRow()-1, location.getColumn()));
        attempts.add(new Location(location.getRow(), location.getColumn()+1));
        attempts.add(new Location(location.getRow(), location.getColumn()-1));
        // diagonal moves
        attempts.add(new Location(location.getRow()+1, location.getColumn()+1));
        attempts.add(new Location(location.getRow()+1, location.getColumn()-1));
        attempts.add(new Location(location.getRow()-1, location.getColumn()+1));
        attempts.add(new Location(location.getRow()-1, location.getColumn()-1));
        for (Location attemptedLocation : attempts) {
            if (Board.inBounds(attemptedLocation)) {
                if (!Board.occupied(attemptedLocation)) {
                    moves.add(new Move(attemptedLocation, false, null));
                } else {
                    Piece otherPiece = Board.getPiece(attemptedLocation);
                    if (isEnemy(otherPiece)) {
                        moves.add(new Move(attemptedLocation, true, otherPiece));
                    }
                }
            }
        }
        return moves;
    }
}
