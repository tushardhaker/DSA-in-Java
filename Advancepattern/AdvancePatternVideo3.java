//  Inverted and Rotated half pyramid

//       *               1st row 1 star , 3 space
//     * *               2nd row 2 star , 2 space
//   * * *               3rd row 3 star , 1 space
// * * * *               4th row 4 star , 0 space



package Advancepattern;
public class AdvancePatternVideo3 {
    public static void pattern(int n ){
        for (int i = 1; i<=n; i++) {
           for (int j = 1; j <= n-i; j++) {
         System.out.print(" ");
           } 
           for (int j = 1; j <=i; j++) {
           System.out.print("*");
           } 
           
           System.out.println();
        }
       
    }
    public static void main(String[] args) {
        pattern(4);
    }
}
