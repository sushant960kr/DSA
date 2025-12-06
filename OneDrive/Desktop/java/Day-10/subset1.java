import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subset1 {
    public static void main(String[] args) {
        int[] arr={1,2,2};

        List<List<Integer>> ans=subSetdupli(arr);
        for(List<Integer> list : ans){
            System.out.println(list);
        }
    }
    // Generate subsets without duplicates
    static List<List<Integer>> subSetdupli(int[] arr) {
        Arrays.sort(arr); // sort so duplicates are adjacent
        List<List<Integer>> outer = new ArrayList<>();

        // start with empty subset
        outer.add(new ArrayList<>());
        int start = 0, end = 0;

        for (int i = 0; i < arr.length; i++) {
            start = 0;

            // if current element == previous, only extend the subsets
            // formed in the last step
            if (i > 0 && arr[i] == arr[i - 1]) {
                start = end + 1;
            }
            end = outer.size() - 1;

            int n = outer.size();
            for (int j = start; j < n; j++) {
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]); // use current element
                outer.add(internal);
            }
        }
        return outer;
    }
}
