public class v1 {
    public static void main(String[] args) {
        A r=new A();
        r.add();
        r.add(10);
        r.add(10,20);
    }
}
class A{
    void add(int ... a){
        int sum=0;
        for (int num : a) {
            sum += num;
        }
        System.out.println("Sum of the number is "+ sum);
    }
}
