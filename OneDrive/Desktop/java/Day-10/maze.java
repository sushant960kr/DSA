//  maze problem - no of ways to reach goal

import java.lang.reflect.Array;
import java.util.ArrayList;

public class maze {
    public static void main(String[] args) {
        //  reach from (0,0) -> (3,3)
        System.out.println(count(3, 3));
        System.out.println("Paths are: "+noOFPath("", 3, 3));
        System.out.println("Path with diagonal is "+pathDiagonal("", 3, 3));
    }
    static int count (int r, int c){
        if (r==1 || c==1) {
            return 1;
        }
        int left=count(r-1, c);
        int right=count(r, c-1);

        return left+right;
    }
    //  print the path
    static ArrayList<String> noOFPath(String p,int r, int c){
        if (r==1 && c==1) {
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list=new ArrayList<>();
        if (r > 1 ) {
            list.addAll(noOFPath(p+'D', r-1, c));
        }
        if (c > 1) {
            list.addAll(noOFPath(p+'R', r, c-1));
        }
        return list;
    }

    //  also also diagonal move
    static ArrayList<String> pathDiagonal(String p,int r, int c){
        if (r==1 && c==1) {
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list=new ArrayList<>();
        //  for diagonal
        if (r > 1  && c > 1) {
            list.addAll(pathDiagonal(p+'D', r-1, c-1));
        }

        if (r > 1 ) {
            list.addAll(pathDiagonal(p+'V', r-1, c));
        }
        if (c > 1) {
            list.addAll(pathDiagonal(p+'H', r, c-1));
        }
        return list;
    }
}
