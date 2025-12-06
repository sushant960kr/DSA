public class Nknights {
    public static void main(String[] args) {
        int n=3;
        boolean[][] board=new boolean[n][n];
        System.out.println("Total ways is "+knight1(board, 0,0,3));
        knight(board , 0,0,3);
    }

    // return the no of ways that it return 
    static int knight1(boolean[][] board, int row, int cols, int knights) {
        if (knights == 0) {
            return 1; // found a valid arrangement
        }
        if (row == board.length) {
            return 0;
        }
        if (cols == board.length) {
            return knight1(board, row + 1, 0, knights);
        }

        int count = 0;
        if (isSafe(board, row, cols)) {
            board[row][cols] = true;
            count += knight1(board, row, cols + 1, knights - 1);
            board[row][cols] = false;
        }

        count += knight1(board, row, cols + 1, knights);
        return count;
    }

    static void knight(boolean[][]  board, int row, int cols, int knights){
        if (knights==0) {
            display(board);
            System.out.println();
            return;
        }
        
        if (row == board.length) {
            return;
        }
        if (cols== board.length) {
            knight(board, row+1,0,knights);
            return;
        }
        
        if (isSafe(board,row,cols)) {
            board[row][cols]=true;
            knight(board, row,cols+1,knights-1);
            board[row][cols]=false;
        }
        knight(board, row,cols+1,knights);
    }

    private static boolean isSafe(boolean[][] board , int row, int cols){
        if (isValid(board, row-2, cols-1)) {
            if (board[row-2][cols-1]) {
                return false;
            }
        }
        if (isValid(board, row-1, cols-2)) {
            if (board[row-1][cols-2]) {
                return false;
            }
        }
        if (isValid(board, row-2, cols+1)) {
            if (board[row-2][cols+1]) {
                return false;
            }
        }
        if (isValid(board, row-1, cols+2)) {
            if (board[row-1][cols+2]) {
                return false;
            }
        }
        return true;
    }

    static boolean isValid(boolean[][] board , int row, int cols){
        //  row check
        if (row >= 0 && row < board.length && cols >=0 && cols < board.length) {
            return true;
        }
        return false;
    }

    private static void display(boolean[][] board){
        for (boolean[] row : board) {
            for (boolean element : row) {
                if (element) {
                    System.out.print("K ");
                }else{
                    System.out.print("X ");
                }
            }System.out.println();
        }
    }
}
