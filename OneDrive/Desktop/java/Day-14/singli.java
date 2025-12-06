import custom.LL;

public class singli {
    public static void main(String[] args) {
        // Using your custom Linked List
        LL list = new LL();
        list.insertFirst(3);
        list.insertLast(4);
        list.insertLast(5);
        // list.insert(100, 3);
        // list.display();
        
        // list.insertFirst(111);
        // System.out.println(list.deleteFirst());
        // list.display();
        // System.out.println(list.deleteLast());
        // list.display();
        // System.out.println(list.delete(1));
        list.display();
        System.out.println(list.size);
        System.out.println(list.Search(4));
        System.out.println(list.recSearch(33));
    }
}
