public class Move {
    private Location location;
    private boolean kill;
    private Piece victim;

    public Move(Location location, boolean kill, Piece victim) {
        this.location = location;
        this.kill = kill;
        this.victim = victim;
    }

    public Location getLocation() {
        return this.location;
    }
}
