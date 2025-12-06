import java.util.ArrayList;
import java.util.Arrays;

public class maze2 {
    public static void main(String[] args) {
        boolean[][] board = {
            {true, true, true},
            {true, true, true},
            {true, true, true}
        };
        int[][] path = new int[board.length][board[0].length];
        ArrayList<String> result = allPathPrint("", board, 0, 0, path, 1);

        System.out.println("\nCollected Paths: " + result);
    }

    // All paths (D, R, U, L) with step matrix printing
    static ArrayList<String> allPathPrint(String p, boolean[][] maze, int r, int c, int[][] path, int step) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            path[r][c] = step;

            // Print the path matrix
            for (int[] row : path) {
                System.out.println(Arrays.toString(row));
            }
            System.out.println("Path: " + p);
            System.out.println();

            ArrayList<String> list = new ArrayList<>();
            list.add(p);

            // backtrack
            path[r][c] = 0;
            return list;
        }

        if (!maze[r][c]) {
            return new ArrayList<>();
        }

        maze[r][c] = false;   // mark visited
        path[r][c] = step;

        ArrayList<String> list = new ArrayList<>();

        // Move Down
        if (r < maze.length - 1) {
            list.addAll(allPathPrint(p + 'D', maze, r + 1, c, path, step + 1));
        }
        // Move Right
        if (c < maze[0].length - 1) {
            list.addAll(allPathPrint(p + 'R', maze, r, c + 1, path, step + 1));
        }
        // Move Up
        if (r > 0) {
            list.addAll(allPathPrint(p + 'U', maze, r - 1, c, path, step + 1));
        }
        // Move Left
        if (c > 0) {
            list.addAll(allPathPrint(p + 'L', maze, r, c - 1, path, step + 1));
        }

        // Backtrack (reset state)
        maze[r][c] = true;
        path[r][c] = 0;

        return list;
    }
}
