
//  search in sorted matrix
public class search {
        static boolean stairSearch(int[][] matrix, int key){
            int rows=0;
            int cols=matrix[0].length-1;
            while (rows < matrix.length && cols >=0) {
                if (matrix[rows][cols]  == key) {
                    System.out.println("Found key at (" + rows + ","+cols+")");
                    return true;
                }
                else if (key < matrix[rows][cols]) {
                    cols--;

                }
                else{ 
                    rows++;

                }
                
            }System.out.println("Key not found");
            return false;
        }
    public static void main(String[] args) {
        int matrix[][] = {{ 10,20,30,40},
        {15,25,35,45},
        {27,29,37,48},
        {32,33,39,50}};
        int key =33;
        stairSearch(matrix, key);
    }
}
