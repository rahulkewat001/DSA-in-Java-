package BackTracking;

public class NQueens {
    public static void main(String[] args) {
        
    }

    static int queen(boolean[][] board, int row) {
        if(row == board.length) {
            display(board);
            return 1;

            int count = 0;

            // plcaing the queen and checking for every row and col
            for(int col = 0; col < board.length; col++) {
                // place the queen if it is safe
                if(isSafe(board, row, col)) {
                    borad
                }
            }
        }
    }
    
}
