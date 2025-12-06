public class new1 {
    public static void main(String[] args) {
        int n=10;
        System.out.println("Numbers from 1 to N is ");
        printIncreasing(n);
        System.out.println();
        System.out.println("Numbers from 'N' to '1' is ");
        printDecreasing(n);
        
    }
    static void printIncreasing(int n){
        if (n==1 || n==0) {
           System.out.println(n);
           return;
        }
         printIncreasing(n-1);

        System.out.println(n);
    }
    static void printDecreasing(int n){
        if (n==1 || n==0) {
            System.out.println(n);
            return;
         }
         System.out.println(n);
         printDecreasing(n-1);
    }
}
