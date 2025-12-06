import java.util.ArrayList;
import java.util.Arrays;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(45);
        list.add(45);
        list.add(47);
        System.out.println(list);

        
        System.out.println(list.contains(48));
        list.set(0, 49);
        System.out.println(list.get(0));
        list.remove(2);
        System.out.println(list);
    }
}
