package TwoD_Array;
public class Array2D_Sorted_matrix {
    public static boolean caseSearch(int matrix[][],int key){
        int row = 0; int col = matrix[0].length-1;
        while (row<matrix.length && col>=0) {
            if (matrix[row][col]==key) {
                System.out.println("Key Found at Index ("+ row + ","+ col +")");
                System.out.println("Thank You user !");
                return true;
            }
            else if (key<matrix[row][col]) {
                col--;
            }
            else {
                row++;
            }
            
        }
        // System.out.println("Key not Found !");
        return false;
    }
    public static void main(String[] args) {
        int matrix[][] = {{10,20,30,40},
                      {15,25,35,45},
                    {27,29,37,48},
                    {32,33,39,50}};
        int key = 39;
        caseSearch(matrix, key);
    }
}
