public class RevStr {
    public static void main(String[] args) {
        StringBuffer r=new StringBuffer("Learn Coding ");
        System.out.println(r.reverse());

        StringBuilder ref=new StringBuilder("Sushant");
        System.out.println(ref.reverse());

        String r2="Learn Java";
        String r1="";
        int l=r2.length();

        for(int i=l-1;i>=0;i--)
        {
            r1=r1+r2.charAt(i);
        }
        System.out.println(r2);
        System.out.println(l);
        System.out.println(r1);

    }
}
