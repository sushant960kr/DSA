public class String12 {
    public static void main(String[] args) {
        String a="Ankit"; //literal
        System.out.println(a);

        String b="Ankit";   //literal
        System.out.println(b);

       a= a.concat(" kumar");   //literal
        System.out.println(a);

        String c=new String("RAM");  //new
        System.out.println(c);

        String d=new String("RAM");  //new
        System.out.println(d);
        c=c.concat(" kumar");
        System.out.println(c);
    }
}
