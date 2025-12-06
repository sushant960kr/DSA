import java.util.ArrayList;
//  maze obstracle
public class maze1 {
    public static void main(String[] args) {
        boolean[][] board = {
            {true, true, true},
            {true, false, true},
            {true, true, true}
        };

        System.out.println("Only Down/Right Paths are: " + PathRestriction("", board, 0, 0));
     
    }

    // Only Down/Right moves with obstacles
    static ArrayList<String> PathRestriction(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        if (!maze[r][c]) {
            return new ArrayList<>();
        }

        ArrayList<String> list = new ArrayList<>();
        if (r < maze.length - 1) {
            list.addAll(PathRestriction(p + 'D', maze, r + 1, c));
        }
        if (c < maze[0].length - 1) {
            list.addAll(PathRestriction(p + 'R', maze, r, c + 1));
        }
        return list;
    }


}
