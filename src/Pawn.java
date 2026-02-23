import java.util.List;
import java.util.LinkedList;

public class Pawn extends Piece {
    public Pawn(int row, int column, String color) {
        super(row, column, color);
        this.icon = 'P';
    }

    // public boolean canMove(Location location) {
    //     List<Move> moves = getMoves();
    //     for (Move move : moves) {
    //         if (location.equals(move.getLocation())) {
    //             return true;
    //         }
    //     }
    //     return false;
    // }

    public List<Move> getMoves() {
        List<Move> moves = new LinkedList<Move>();
        // normal moves
        Location forwardAttempt;
        if (this.color.equals("black")) {
            forwardAttempt = new Location(location.getRow()+1, location.getColumn());
        } else {
            forwardAttempt = new Location(location.getRow()-1, location.getColumn());
        }
        if (Board.inBounds(forwardAttempt) && !Board.occupied(forwardAttempt)) {
            moves.add(new Move(forwardAttempt, false, null));
        }
        // attack moves
        List<Location> attempts = new LinkedList<>();
        if (this.color.equals("black")) {
            attempts.add(new Location(location.getRow()+1, location.getColumn()+1));
            attempts.add(new Location(location.getRow()+1, location.getColumn()-1));
        } else {
            attempts.add(new Location(location.getRow()-1, location.getColumn()+1));
            attempts.add(new Location(location.getRow()-1, location.getColumn()+1));
        }
        for (Location attemptedLocation : attempts) {
            if (Board.inBounds(attemptedLocation) && Board.occupied(attemptedLocation)) {
                Piece otherPiece = Board.getPiece(attemptedLocation);
                if (isEnemy(otherPiece)) {
                    moves.add(new Move(attemptedLocation, true, otherPiece));
                }
            }
        }
        return moves;
    }

}
