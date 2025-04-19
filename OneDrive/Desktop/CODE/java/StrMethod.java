public class StrMethod {
    public static void main(String[] args) {
        String a="Ankit";
        String b="Rahul";
        System.out.println(a.toLowerCase());
        System.out.println(b.toUpperCase());

        System.out.println(b.concat(a));
        System.out.println(b.length());

        String c="      Ankush      ";
        String d=" ";
        System.out.println(c.trim());
        System.out.println(d.isEmpty());

        System.out.println(b.charAt(2));
        System.out.println(a.indexOf("k"));

        System.out.println(b.equals(a));
        System.out.println(b.replace('l', 'i'));
    }
}
