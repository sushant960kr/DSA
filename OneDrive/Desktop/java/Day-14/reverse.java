//  reverse a linked list
import custom.LL;
public class reverse {
    public static void main(String[] args) {
        
        LL list=new LL();
        list.insertFirst(3);
        list.insertLast(4);
        list.insertLast(5);
        list.display();
        list.reverse();
        list.display();
    }
}
