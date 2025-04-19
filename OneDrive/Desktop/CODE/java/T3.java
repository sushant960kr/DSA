public class T3 {
    void div(int a, int b) throws ArithmeticException
    {
        if (b==0) {
            throw new ArithmeticException();
        } else {
            int c=a/b;
            System.out.println(c);
        }
    }
    public static void main(String[] args) {
        T3 r=new T3();
        r.div(10, 0);
    }
}
