package Array;
public class Array_2D_Spiral {
    public static void printSpiral(int matrix[][]) {
        int StartRow = 0;
        int endRow = matrix.length - 1;
        int startCol = 0;
        int endCol = matrix[0].length - 1;

        while (StartRow <= endRow && startCol <= endCol) {
            // top
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[StartRow][j] + " ");
            }
            // Right
            for (int i = StartRow + 1; i <= endCol; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }
            // Bottom
            for (int j = endCol - 1; j >= startCol; j--) {
                System.out.print(matrix[endRow][j] + " ");
            } // agar n*m ki odd matrix ho toh ek logic apply krna hoga kyu ki same value
              // left // repeat na ho.
              // if(startcol==endcol){
              // break; }
            for (int i = endRow - 1; i >= StartRow + 1; i--) {
                System.out.print(matrix[i][startCol] + " ");
            }
            startCol++;
            StartRow++;
            endCol--;
            endRow--;

        }
        System.out.println();
    }

    public static int Diagonal_Sum(int matrix[][]) {
        // Diagonal Sum is only for Square matrix(n*n)............
        int sum = 0;
        // primary diagonal sum
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i == j) {
                    sum += matrix[i][j];
                }
            }
        }
        // secondary diagonal sum
        for (int i = 0; i < matrix.length; i++) {
            for (int j = matrix[0].length; j >= 0; j--) {
                if (i == j) {
                    sum += matrix[i][j];
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        printSpiral(matrix);
        System.out.println("The Diagonal Sum is = " + Diagonal_Sum(matrix));
    }
}
