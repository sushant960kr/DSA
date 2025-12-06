import custom.LL;

public class megre {
    public static void main(String[] args) {
        LL first=new LL();
        LL second=new LL();
        first.insertLast(1);
        first.insertLast(3);
        first.insertLast(5);

        second.insertLast(1);
        second.insertLast(2);
        second.insertLast(5);
        second.insertLast(10);

        LL ans= LL.merge(first, second);
        ans.display();
        
    }

}
