public class Location {
    private int row;
    private int column;

    public Location(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public int getRow() {
        return this.row;
    }

    public int getColumn() {
        return this.column;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    @Override
    public String toString() {
        return "Row: " + this.row + ", Column: " + this.column + ", " + Board.locationToCellName(this);
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other.getClass() == Location.class) {
            Location otherLocation = (Location)other;
            return (
                (this.getRow() == otherLocation.getRow()) &&
                (this.getColumn() == otherLocation.getColumn())
            );
        }
        return false;
    }
}
