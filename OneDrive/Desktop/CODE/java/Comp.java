public class Comp {
    public static void main(String[] args) {
        String a="Lion";
        String b=new String("Lion");

        if (a.equals(b)) {
            System.out.println("Both the string are same");
        } else {
            System.out.println("False");
        }
    }
}
