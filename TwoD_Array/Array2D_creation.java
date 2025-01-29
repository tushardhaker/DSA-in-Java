package TwoD_Array;

import java.util.*;
public class Array2D_creation {
    public static boolean search(int matrix [][], int key) {
        for (int index = 0; index < matrix.length; index++) {
            for(int j = 0; j<matrix[0].length; j++) {
               if (matrix[index][j]==key) {
                System.out.println("Key Found at cell ("+index+","+j+")");
                return true;
               }
            }
           
        }  
        System.out.println("not found");
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrix [][] = new int[3][3];
        int n = matrix.length , m = matrix[0].length;
        for (int index = 0; index < n; index++) {
            for(int j = 0; j<m; j++) {
                matrix[index][j] = sc.nextInt();
            }
        }
        // output
        for (int index = 0; index < n; index++) {
            for(int j = 0; j<m; j++) {
               System.out.print(matrix[index][j]+" ");
            }
            System.out.println();
        }
        //  For Search our key in matrix...
         search(matrix, 5);
        
    }
}
