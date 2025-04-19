public class Recursion {
    public static void main(String[] args) {
        Recursion r=new Recursion();
        int a=r.sum(10);
        System.out.print("Sun of first nnatural number is "+a);
    }
    int sum(int b){
        if(b>0){
            return b+sum(b-1);
        }
        else{
            return 0;
        }
    }
}
