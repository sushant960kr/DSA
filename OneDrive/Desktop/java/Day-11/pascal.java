
public class pascal {
    public static void main(String[] args) {
        int rows=5;
        for (int i = 0; i < rows; i++) {
            int sum = 1 << i;  
            System.out.println("Sum of row " + i + " = " + sum);
        }

    }
}
