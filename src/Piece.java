public abstract class Piece {
    private int row;
    private char column;
    private String color;
    protected char icon;
    protected int allowedTraversal;


    public Piece() {

    }

    public Piece(int row, char column, String color) {
        this.row = row;
        this.column = column;
        this.color = color;
    }

    public char getIcon() {
        return this.icon;
    }
}
