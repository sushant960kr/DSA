public class str {
    public static void main(String[] args) {
        String s=new String("sk");
        String l=new String("sk");
        System.out.println(s==l);
        System.out.println(s.length());
        System.out.println(s.concat(l));
        System.out.println(s.equals(l));
        System.out.println((char)('a'+3));
        char[] ch=s.toCharArray();
        System.out.println(ch);
        s.replace("k", "[]");
        System.out.println( s.replace("k", "[]"));
        System.out.println(s.compareTo(l));
        
    }
}
