import custom.LL;

public class duplictes {
    public static void main(String[] args) {
        LL list=new LL();
        list.insertFirst(1);
        list.insertFirst(1);
        list.insertFirst(1);
        list.insertFirst(1);
        list.insertLast(2);
        list.insertLast(3);
        list.display();
        list.removeDuplicates();
        list.display();
    }
}
