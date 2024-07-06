import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Board {
    private final String[][] board = {
            {"A8", "B8", "C8", "D8", "E8", "F8", "G8", "H8"},
            {"A7", "B7", "C7", "D7", "E7", "F7", "G7", "H7"},
            {"A6", "B6", "C6", "D6", "E6", "F6", "G6", "H6"},
            {"A5", "B5", "C5", "D5", "E5", "F5", "G5", "H5"},
            {"A4", "B4", "C4", "D4", "E4", "F4", "G4", "H4"},
            {"A3", "B3", "C3", "D3", "E3", "F3", "G3", "H3"},
            {"A2", "B2", "C2", "D2", "E2", "F2", "G2", "H2"},
            {"A1", "B1", "C1", "D1", "E1", "F1", "G1", "H1"}
    };

    private Piece[][] adaptiveBoard;


//    private Map<String,Piece> pieceMap;

    public Board() {
//        pieceMap = new HashMap<>();
//        pieceMap.put("A1", new Rook(1, 'A', "white"));
//        pieceMap.put("B1", new Knight(1, 'B', "white"));
//        pieceMap.put("C1", new Bishop(1, 'C', "white"));
//        pieceMap.put("D1", new Queen(1, 'D', "white"));
//        pieceMap.put("E1", new King(1, 'E', "white"));
//        pieceMap.put("F1", new Bishop(1, 'F', "white"));
//        pieceMap.put("G1", new Knight(1, 'G', "white"));
//        pieceMap.put("H1", new Rook(1, 'H', "white"));
//
//        pieceMap.put("A2", new Pawn(2, 'A', "white"));
//        pieceMap.put("B2", new Pawn(2, 'B', "white"));
//        pieceMap.put("C2", new Pawn(2, 'C', "white"));
//        pieceMap.put("D2", new Pawn(2, 'D', "white"));
//        pieceMap.put("E2", new Pawn(2, 'E', "white"));
//        pieceMap.put("F2", new Pawn(2, 'F', "white"));
//        pieceMap.put("G2", new Pawn(2, 'G', "white"));
//        pieceMap.put("H2", new Pawn(2, 'H', "white"));
//
//        pieceMap.put("A8", new Rook(8, 'A', "black"));
//        pieceMap.put("B8", new Knight(8, 'B', "black"));
//        pieceMap.put("C8", new Bishop(8, 'C', "black"));
//        pieceMap.put("D8", new Queen(8, 'D', "black"));
//        pieceMap.put("E8", new King(8, 'E', "black"));
//        pieceMap.put("F8", new Bishop(8, 'F', "black"));
//        pieceMap.put("G8", new Knight(8, 'G', "black"));
//        pieceMap.put("H8", new Rook(8, 'H', "black"));
//
//        pieceMap.put("A7", new Pawn(7, 'A', "black"));
//        pieceMap.put("B7", new Pawn(7, 'B', "black"));
//        pieceMap.put("C7", new Pawn(7, 'C', "black"));
//        pieceMap.put("D7", new Pawn(7, 'D', "black"));
//        pieceMap.put("E7", new Pawn(7, 'E', "black"));
//        pieceMap.put("F7", new Pawn(7, 'F', "black"));
//        pieceMap.put("G7", new Pawn(7, 'G', "black"));
//        pieceMap.put("H7", new Pawn(7, 'H', "black"));

        //using adaptive board

        adaptiveBoard = new Piece[8][8];
        adaptiveBoard[0][0] = new Rook(8, 'A', "black");
        adaptiveBoard[0][1] = new Knight(8, 'B', "black");
        adaptiveBoard[0][2] = new Bishop(8, 'C', "black");
        adaptiveBoard[0][3] = new Queen(8, 'D', "black");
        adaptiveBoard[0][4] = new King(8, 'E', "black");
        adaptiveBoard[0][5] = new Bishop(8, 'F', "black");
        adaptiveBoard[0][6] = new Knight(8, 'G', "black");
        adaptiveBoard[0][7] = new Rook(8, 'H', "black");

        adaptiveBoard[1][0] = new Pawn(7, 'A', "black");
        adaptiveBoard[1][1] = new Pawn(7, 'B', "black");
        adaptiveBoard[1][2] = new Pawn(7, 'C', "black");
        adaptiveBoard[1][3] = new Pawn(7, 'D', "black");
        adaptiveBoard[1][4] = new Pawn(7, 'E', "black");
        adaptiveBoard[1][5] = new Pawn(7, 'F', "black");
        adaptiveBoard[1][6] = new Pawn(7, 'G', "black");
        adaptiveBoard[1][7] = new Pawn(7, 'H', "black");

        adaptiveBoard[7][0] = new Rook(1, 'A', "white");
        adaptiveBoard[7][1] = new Knight(1, 'B', "white");
        adaptiveBoard[7][2] = new Bishop(1, 'C', "white");
        adaptiveBoard[7][3] = new Queen(1, 'D', "white");
        adaptiveBoard[7][4] = new King(1, 'E', "white");
        adaptiveBoard[7][5] = new Bishop(1, 'F', "white");
        adaptiveBoard[7][6] = new Knight(1, 'G', "white");
        adaptiveBoard[7][7] = new Rook(1, 'H', "white");

        adaptiveBoard[6][0] = new Pawn(2, 'A', "white");
        adaptiveBoard[6][1] = new Pawn(2, 'B', "white");
        adaptiveBoard[6][2] = new Pawn(2, 'C', "white");
        adaptiveBoard[6][3] = new Pawn(2, 'D', "white");
        adaptiveBoard[6][4] = new Pawn(2, 'E', "white");
        adaptiveBoard[6][5] = new Pawn(2, 'F', "white");
        adaptiveBoard[6][6] = new Pawn(2, 'G', "white");
        adaptiveBoard[6][7] = new Pawn(2, 'H', "white");

        for (int i = 2; i <=5; i++) {
            Arrays.fill(adaptiveBoard[i], null);
        }
    }

    public String rcToString(int row, char column) {
        return "" + column + row;
    }

    public static int[] cellNameToIndex(String cellname) {
        char column = cellname.charAt(1);
        int columnInt = column - 'A';
        int row = cellname.charAt(0) - '0';
        int rowInt = 7 - (row - 1);
        return new int[]{rowInt, columnInt};
    }

    public static String indexToCellName(int[] index) {
        int rowInt = index[0];
        int columnInt = index[1];

        // Convert row index back to row number
        int row = 7 - (rowInt - 1);
        char rowChar = (char) (row + '0');

        // Convert column index back to column letter
        char column = (char) (columnInt + 'A');

        // Combine row and column to form the cell name
        return "" + rowChar + column;
    }

    public void printBoard() {
        for (Piece[] row : adaptiveBoard) {
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
