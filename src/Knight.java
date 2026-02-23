import java.util.LinkedList;
import java.util.List;

public class Knight extends Piece{
    public Knight(int row, int column, String color) {
        super(row, column, color);
        this.icon = 'H';
    }

    public List<Move> getMoves() {
        List<Move> moves = new LinkedList<Move>();
        List<Location> attempts = new LinkedList<>();
        attempts.add(new Location(location.getRow()+2, location.getColumn()+1));
        attempts.add(new Location(location.getRow()+2, location.getColumn()-1));
        attempts.add(new Location(location.getRow()+1, location.getColumn()+2));
        attempts.add(new Location(location.getRow()+1, location.getColumn()-2));
        attempts.add(new Location(location.getRow()-2, location.getColumn()+1));
        attempts.add(new Location(location.getRow()-2, location.getColumn()-1));
        attempts.add(new Location(location.getRow()-1, location.getColumn()+2));
        attempts.add(new Location(location.getRow()-1, location.getColumn()-2));
        for (Location attemptedLocation : attempts) {
            if (Board.inBounds(attemptedLocation)) {
                if (!Board.occupied(attemptedLocation)) {
                    moves.add(new Move(this, attemptedLocation, false, null));
                } else {
                    Piece otherPiece = Board.getPiece(attemptedLocation);
                    if (isEnemy(otherPiece)) {
                        moves.add(new Move(this, attemptedLocation, true, otherPiece));
                    }
                }
            }
        }
        return moves;
    }
}
