public class Move {
    private Piece piece;
    private Location location;
    private boolean kill;
    private Piece victim;

    public Move(Piece piece, Location location, boolean kill, Piece victim) {
        this.piece = piece;
        this.location = location;
        this.kill = kill;
        this.victim = victim;
    }

    public Location getLocation() {
        return this.location;
    }

    public Piece getPiece() {
        return this.piece;
    }

    public boolean getKill() {
        return this.kill;
    }

    public Piece getVictim() {
        return this.victim;
    }
}
