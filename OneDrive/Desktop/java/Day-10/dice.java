//  No of dice roll to get target sum
/* Input [1,2,3,4,5,6] ; Target=3
Output=[12,3,111,21]
 */

import java.util.ArrayList;
import java.util.List;

public class dice {
    public static void main(String[] args) {
        dice("", 3);
        System.out.println(diceRet("", 4));
    }
    static void dice(String p, int target){
        if (target==0) {
            System.out.println(p);
            return;
        }
        for (int i = 1; i <= 6 && i <= target; i++) {
            dice(p+i, target-i);
        }
    }
    //  return array list
    static ArrayList<String> diceRet(String p, int target){
        if (target==0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list=new ArrayList<>();
        for (int i = 1; i <= 6 && i <= target; i++) {
           list.addAll(diceRet(p+i, target-i));
        }
        return list;
    }
}
