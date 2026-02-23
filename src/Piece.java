import java.util.List;

public abstract class Piece {
    protected Location location;
    protected String color;
    protected char icon;

    public Piece(int row, int column, String color) {
        this.location = new Location(row, column);
        this.color = color;
    }

    public char getIcon() {
        return this.icon;
    }

    public String getColor() {
        return this.color;
    }

    public Location getLocation() {
        return this.location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public abstract List<Move> getMoves();

    public boolean move(String cellname) {
        Location location = Board.cellNameToLocation(cellname);
        Move move = tryMove(location);
        if (move != null) {
            Board.movePiece(move);
            return true;
        } else {
            return false;
        }
    }

    private Move tryMove(Location location) {
        List<Move> moves = getMoves();
        for (Move move : moves) {
            if (location.equals(move.getLocation())) {
                return move;
            }
        }
        return null;
    }

    public boolean isEnemy(Piece other) {
        return !this.color.equals(other.getColor());
    }

    public void printLocation() {
        System.out.println(Board.locationToCellName(this.location));
    }

    @Override
    public String toString() {
        return "Type: " + getClass() + 
            "\nLocation: " + Board.locationToCellName(location) +
            "\nColor: " + getColor();
    }
}
