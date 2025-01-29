package Advancepattern;
public class Advance_pattern_Solid_Rohmbus {
// Print solid Rohumbus

//     * * * * *       1st row , 4 space
//    * * * * *        2nd row , 3 space
//   * * * * *         3rd row , 2 space
//  * * * * *          4th row , 1 space
// * * * * *           5th row , 0 space

public static void pattern(int n)
{
  for (int i = 1; i<=n; i++) {
    for (int j = 1; j <= n-i; j++) {
        System.out.print(" ");
    }
    for (int j = 1; j <= n; j++) {
        System.out.print("*");
    }
    System.out.println();
  }
}

  public static void pattern1(int a,int b){
    //  Print Hollow rohumbus 
         
//     * * * * *       1st row , 0 space
//    *       *        2nd row , 3 space
//   *       *         3rd row , 3 space
//  *       *          4th row , 3 space
// * * * * *           5th row , 0 space
 
  for (int i = 1; i<=a; i++) {
    for (int j = 1; j <= a-i; j++) {                                    
        System.out.print(" ");
    }
    for (int j = 1; j <= b; j++) {
        if (j==1 || j== b || i==1 || i==a) {
            System.out.print("*");
        }
        else{
            System.out.print(" ");
        }
    }
    System.out.println();
  }
 
}
 public static void main(String[] args) {     
pattern(5);
pattern1(5, 5);
    }
}
