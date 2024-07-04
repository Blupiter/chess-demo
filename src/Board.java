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


    private Map<String,Piece> pieceMap;

    public Board() {
        pieceMap = new HashMap<>();
        pieceMap.put("A1", new Rook(1, 'A', "white"));
        pieceMap.put("B1", new Knight(1, 'B', "white"));
        pieceMap.put("C1", new Bishop(1, 'C', "white"));
        pieceMap.put("D1", new Queen(1, 'D', "white"));
        pieceMap.put("E1", new King(1, 'E', "white"));
        pieceMap.put("F1", new Bishop(1, 'F', "white"));
        pieceMap.put("G1", new Knight(1, 'G', "white"));
        pieceMap.put("H1", new Rook(1, 'H', "white"));

        pieceMap.put("A2", new Pawn(2, 'A', "white"));
        pieceMap.put("B2", new Pawn(2, 'B', "white"));
        pieceMap.put("C2", new Pawn(2, 'C', "white"));
        pieceMap.put("D2", new Pawn(2, 'D', "white"));
        pieceMap.put("E2", new Pawn(2, 'E', "white"));
        pieceMap.put("F2", new Pawn(2, 'F', "white"));
        pieceMap.put("G2", new Pawn(2, 'G', "white"));
        pieceMap.put("H2", new Pawn(2, 'H', "white"));

        pieceMap.put("A8", new Rook(8, 'A', "black"));
        pieceMap.put("B8", new Knight(8, 'B', "black"));
        pieceMap.put("C8", new Bishop(8, 'C', "black"));
        pieceMap.put("D8", new Queen(8, 'D', "black"));
        pieceMap.put("E8", new King(8, 'E', "black"));
        pieceMap.put("F8", new Bishop(8, 'F', "black"));
        pieceMap.put("G8", new Knight(8, 'G', "black"));
        pieceMap.put("H8", new Rook(8, 'H', "black"));

        pieceMap.put("A7", new Pawn(7, 'A', "black"));
        pieceMap.put("B7", new Pawn(7, 'B', "black"));
        pieceMap.put("C7", new Pawn(7, 'C', "black"));
        pieceMap.put("D7", new Pawn(7, 'D', "black"));
        pieceMap.put("E7", new Pawn(7, 'E', "black"));
        pieceMap.put("F7", new Pawn(7, 'F', "black"));
        pieceMap.put("G7", new Pawn(7, 'G', "black"));
        pieceMap.put("H7", new Pawn(7, 'H', "black"));
    }

    public String rcToString(int row, char column) {
        return "" + column + row;
    }

    public void printBoard() {
        for (String[] row : this.board) {
            for (String cell : row) {
                if (this.pieceMap.containsKey(cell)) {
                    System.out.print(this.pieceMap.get(cell).getIcon() + " ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
