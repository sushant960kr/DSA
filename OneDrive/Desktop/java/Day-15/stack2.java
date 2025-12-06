import java.util.Stack;
//  implement using Linkedlist
public class stack2 {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next= null;
        }
    }
    static class  stack {
        static Node head= null;
        public static boolean isEmpty(){
            return head== null;
        }
        //  push
        public static void push(int data){
            Node newNode= new Node(data);
            if (isEmpty()) {
                head =  newNode;
                return;
            }
            newNode.next= head;
            head=  newNode;
        }
        //  pop
        public static int pop(){
            if (isEmpty()) {
                return -1;
            }
            int top= head.data;
            head= head.next;
            return top;
        }
        //  peek
        public static int peek(){
            if (isEmpty()) {
                return -1;
            }
           return head.data;
        }
    }
    public static void main(String[] args) {
        // stack s1=new stack();
        //  implement using jcf
        Stack<Integer> s1=new Stack<>();
        s1.push(1);
        s1.push(2);
        s1.push(3);

        while (!s1.isEmpty()) {
            System.out.print(s1.peek()+" ");
            s1.pop();
        }
    }
}
