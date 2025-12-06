import java.util.ArrayList;

public class list {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        convert(arr);
        System.out.println(list);
    }
    static ArrayList<Integer> list =new ArrayList<>();
    static void convert(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
    }
}
