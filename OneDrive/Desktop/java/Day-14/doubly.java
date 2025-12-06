import custom.DLL;
public class doubly {
    public static void main(String[] args) {
        DLL list=new DLL();
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(7);
        
        list.insertAfter(7, 9);
        list.display();
        System.out.println("Print in Reverse");
        list.displayRev();
        
        
    }
}
