import java.util.Queue;

public class queue1 {
    public static class queue2 {
        static int size;
        static int arr[];
        static int rear;
        queue2(int n){
            arr= new int[n];
            size=n;
            rear=-1;
        }
        public static boolean isEmpty(){
            return rear==-1;
        }
        // add
        public static void add(int data){
            if(rear==size-1){
                System.out.println("Queue is full");
                return;
            }
            rear = rear +1;
            arr[rear]= data;
        }
        // remove
        public static int remove(){
            if (isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }
            int front = arr[0];
            for (int i = 0; i <rear; i++) {
                arr[i]=arr[i+1];
            }rear--;
            return front;
        }
        // peek
        public static int peek(){
            if (isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }
            return arr[0];
        }
        
    }
    public static void main(String[] args) {
        queue2 q=new queue2(5);
        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
