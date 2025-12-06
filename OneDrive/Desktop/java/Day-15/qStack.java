// 232

import java.util.Stack;

public class qStack {
    static class MyQueue {
        static Stack<Integer> s1=new Stack<>();
        static Stack<Integer> s2=new Stack<>();
        public MyQueue() {
            
        }
        
        public void push(int x) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }

            s1.push(x);

            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }
        
        public int pop() {
            if (isEmpty()) {
                System.out.println("Queue Empty");
                return -1;
            }return s1.pop();
        }
        
        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue Empty");
                return -1;
            }return s1.peek();
        }
        
        public boolean isEmpty() {
            return s1.isEmpty();
        }
    }
    public static void main(String[] args) {
        MyQueue q=new MyQueue();
        q.push(1);
        q.push(2);
        q.push(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.pop();
        }

    }
}
