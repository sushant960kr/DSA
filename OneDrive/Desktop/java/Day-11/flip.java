import java.util.Arrays;

public class flip {
    public  static int[][] flipAndInvertImage(int[][] image) {
        for (int[] row : image) {
            // reverse the array
            for (int i = 0; i < image[0].length+1 / 2; i++) {
                // swap
                int temp= row[i] ^ 1;
                row[i]= row[image[0].length-1-i];
                row[image[0].length-1-i]=temp;
            }
        }return image;
    }
    public static void main(String[] args) {
        int[][] images = {
            {1, 1, 0},
            {1, 0, 1},
            {0, 0, 0}
        };
        int[][] result=flipAndInvertImage(images);
        System.out.println("Flipping of array is "+result);
        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }
    }
}
