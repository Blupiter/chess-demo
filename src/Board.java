import java.util.Arrays;

public class Board {
    // private final String[][] board = {
    //         {"A8", "B8", "C8", "D8", "E8", "F8", "G8", "H8"},
    //         {"A7", "B7", "C7", "D7", "E7", "F7", "G7", "H7"},
    //         {"A6", "B6", "C6", "D6", "E6", "F6", "G6", "H6"},
    //         {"A5", "B5", "C5", "D5", "E5", "F5", "G5", "H5"},
    //         {"A4", "B4", "C4", "D4", "E4", "F4", "G4", "H4"},
    //         {"A3", "B3", "C3", "D3", "E3", "F3", "G3", "H3"},
    //         {"A2", "B2", "C2", "D2", "E2", "F2", "G2", "H2"},
    //         {"A1", "B1", "C1", "D1", "E1", "F1", "G1", "H1"}
    // };

    private static Piece[][] board;

    public static void initBoard() {
        board = new Piece[8][8];

        for (int i = 0; i < board[0].length; i++) {
            board[1][i] = new Pawn(1, i, "black");
            board[6][i] = new Pawn(6, i, "white");
        }

        board[0][0] = new Rook(0, 0, "black");
        board[0][7] = new Rook(0, 7, "black");
        board[0][1] = new Knight(0, 1, "black");
        board[0][6] = new Knight(0, 6, "black");
        board[0][2] = new Bishop(0, 2, "black");
        board[0][5] = new Bishop(0, 5, "black");
        board[0][3] = new Queen(0, 3, "black");
        board[0][4] = new King(0, 4, "black");

        board[7][0] = new Rook(0, 0, "white");
        board[7][7] = new Rook(0, 7, "white");
        board[7][1] = new Knight(0, 1, "white");
        board[7][6] = new Knight(0, 6, "white");
        board[7][2] = new Bishop(0, 2, "white");
        board[7][5] = new Bishop(0, 5, "white");
        board[7][3] = new Queen(0, 3, "white");
        board[7][4] = new King(0, 4, "white");

        for (int i = 2; i <=5; i++) {
            Arrays.fill(board[i], null);
        }
    }

    public static Piece[][] getBoard() {
        return board;
    }

    public static String rcToString(int row, char column) {
        return "" + column + row;
    }

    public static Location cellNameToLocation(String cellname) {
        char column = cellname.charAt(1);
        int columnInt = column - 'A';
        int row = cellname.charAt(0) - '0';
        int rowInt = 7 - (row - 1);
        return new Location(rowInt, columnInt);
    }

    public static Piece cellNameToPiece(String cellname) {
        Location location = cellNameToLocation(cellname);
        return board[location.getRow()][location.getColumn()];
    }

    public static String locationToCellName(Location location) {

        int rowInt = location.getRow();
        int columnInt = location.getColumn();

        // Convert row index back to row number
        int row = 7 - (rowInt - 1);
        char rowChar = (char) (row + '0');

        // Convert column index back to column letter
        char column = (char) (columnInt + 'A');

        // Combine row and column to form the cell name
        return "" + rowChar + column;
    }

    public static boolean inBounds(Location location) {
        return ((location.getRow() < 8 && location.getRow() >= 0) &&
                (location.getColumn() < 8 && location.getColumn() >= 0));
    }

    public static boolean occupied(Location location) {
        return board[location.getRow()][location.getColumn()] != null;
    }

    public static Piece getPiece(Location location) {
        return board[location.getRow()][location.getColumn()];
    }

    public static void printBoard() {
        for (Piece[] row : board) {
            for (Piece piece : row) {
                if (piece != null) {
                    System.out.print(piece.getIcon() + " ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
