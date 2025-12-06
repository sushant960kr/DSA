import java.util.*;
public class queue {
    public static void main(String[] args) {
        Queue<Integer>  queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        System.out.println(queue);
        queue.remove();
        System.out.println(queue);

        Deque<Integer> deque=new ArrayDeque<>();
        deque.add(1);
        deque.add(2);
        deque.add(3);
        System.out.println(deque);
        deque.removeFirst();
        System.out.println(deque);
    }
}
