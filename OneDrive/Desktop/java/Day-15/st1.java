

public class st1 {
    public static void main(String[] args) {
        Cstack stack = new DynamicStack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40); 
        stack.push(50);
        stack.push(60);

        System.out.println("Top element: " + stack.peek());

        DynamicStack stack1=new DynamicStack(5);
        stack1.push(10);
        stack1.push(20);
        stack1.push(30);
        stack1.push(40); 
        stack1.push(50);
        stack1.push(60);


    }
}
