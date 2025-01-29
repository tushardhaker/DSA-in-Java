  //  Print Hollow Rectangle  

        // * * * * *
        // *       *
        // *       *
        // * * * * *

        package Advancepattern;
public class Advance_Pattern_video1 {
    public static void hollow_rectangle(int rows , int column){
        for (int index = 1; index <=rows; index++) {
            //  outer loop
            for (int i = 1; i<=column; i++) {
                // inner loop
                if (index==1 || index==rows || i==1 || i==column) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }
           
            System.out.print("\n");
        }
    }
    public static void main(String[] args) {
      hollow_rectangle(5,5 );
    }
}
