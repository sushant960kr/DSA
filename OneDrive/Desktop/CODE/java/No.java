public class No {
    public static void main(String[] args) {
        int a=10,b=20,c=30;
        if (a>b) {
            if (a>c) {
                System.out.print("a is greater" + a);
            }
            else{
                System.out.print("c is greater" + c);
            }
        } else {
                
            if (b>c) {
                System.out.print("b is greater" + b);
                
            } else {
                System.out.print("c is greater than by b is " + (c-b));
                
            }
            
        }

    }
}
