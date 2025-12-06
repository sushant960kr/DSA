import custom.LL;
public class palidrome {
    public static void main(String[] args) {
        /* 1. find midNode
         * 2. 2nd half reverse
         * 3. check if 1st half == 2nd half
         * this is known as slow-fast approach
         */
        LL list=new LL();
        list.insertFirst(1);
        list.insert(2, 1);
        list.insertLast(1);
        list.display();
        System.out.println(list.checkPalidrome());
    }
}
