public class pat31 {
    public static void main(String[] args) {
        int n = 4;
        int size = 2 * n - 1;

        for (int rows = 0; rows < size; rows++) {
            for (int cols = 0; cols < size; cols++) {
                int atEveryIndex = Math.min(Math.min(rows, cols), Math.min(size - 1 - rows, size - 1 - cols));
                System.out.print((n - atEveryIndex) + " ");
            }
            System.out.println();
        }
    }
}
