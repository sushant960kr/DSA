import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,4,5,6};
        int target=4;
        ArrayList<Integer> ans= findALL(arr, 4, 0, new ArrayList<>());
        System.out.println("Indices is "+ans);

        System.out.println("Indices is "+findALL2(arr, 4, 0));
      
    }
    static ArrayList<Integer> findALL(int[] arr, int target, int index, ArrayList<Integer> list){
        if (index==arr.length) {
            return list;
        }
        if (arr[index]== target) {
            list.add(index);
        }
        return findALL(arr, target, index+1, list);
    }

    static ArrayList<Integer> findALL2(int[] arr, int target, int index){
        ArrayList<Integer> list=new ArrayList<>();
        if (index==arr.length) {
            return list;
        }
        //  contain answer for that fun only
        if (arr[index]== target) {
            list.add(index);
        }
        ArrayList<Integer> ansFrombelowCalls= findALL2(arr, target, index+1);
        //  sara ans ko ek list mai save krega
        list.addAll(ansFrombelowCalls);
        return list;
       
    }

}
