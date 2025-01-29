package Advancepattern;

public class Advance_pattern_Mountain {
    public static void pattern(int n ){
        for (int i = 1; i<=n; i++) {
           for (int j = 1; j <= n-i; j++) {
         System.out.print(" ");
           } 
           for (int j = 1; j <=2*i-1; j++) {
           System.out.print("*");
           }                                              // 2*1-1=1., 2*2-1=3
           
           System.out.println();

        }
        for (int index = n; index >=1; index--) {

               for (int j = 1; j<= n-index; j++) {
                System.out.print(" ");
            } 
            for (int j = 1; j <=2*index-1 ; j++) {
                System.out.print("*");
               }
             
            System.out.println();
        }
       
       
    }
    public static void main(String[] args) {
        pattern(5);
    }
}


               