public class Test {
    public static void main(String[] args) {
        int[] test = Board.cellNameToIndex("7B");
        System.out.println(test[0] + ", " + test[1]);

        test = Board.cellNameToIndex("1H");

        System.out.println(test[0] + ", " + test[1]);

        System.out.println(Board.indexToCellName(new int[]{7,7}));
        System.out.println(Board.indexToCellName(new int[]{1,1}));
    }
}
