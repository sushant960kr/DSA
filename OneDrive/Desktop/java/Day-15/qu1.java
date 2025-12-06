import custom.*;

public class qu1 {
    public static void main(String[] args) {
        CustomQueue<Integer> queue=new CustomQueue(3);
        queue.insert(3);
        queue.insert(4);
        queue.insert(5);

        queue.display();

        CircularQueue<Integer> q1=new CircularQueue(2);
        q1.insert(3);
        q1.insert(4);
        q1.display();
        q1.remove();
        q1.display();
        
        DynamicQueue<Integer> q2=new DynamicQueue(1);
        q2.insert(1);
        q2.insert(2);
        q3.insert(3);

        q2.display();

    }

}
