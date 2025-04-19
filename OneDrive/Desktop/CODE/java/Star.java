public class Star {
    public static void main(String[] args) {
        int i,j,k;
        for(i=1;i<=5;i++)  //rows
        {
            for(j=1;j<i;j++) //space
            {
                System.out.print(" ");

            }
            for(k=i;k<=5;k++) //space
            {
                System.out.print("*");

            }
            System.out.print("\n");
        }
    }
}
