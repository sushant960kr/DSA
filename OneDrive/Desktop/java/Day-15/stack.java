import java.util.*;
public class stack {
    public static void main(String[] args) {
        //  inbuilt example
        Stack<Integer> stack=new Stack<>();
        stack.push(34);
        stack.push(15);
        stack.push(25);
        stack.push(45);
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
    }
}
