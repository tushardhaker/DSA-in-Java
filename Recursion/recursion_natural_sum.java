package Recursion;
public class recursion_natural_sum {
    public static int Sum(int n){
        if(n < 0 ){
           System.out.println("Number is Invalid , Please enter correct Number");
           return -1;
        }
        if( n == 1){
           return 1;
        }
        int natural1 = Sum(n-1);
        int natural = n+natural1;
        return natural;
    }
 public static void main(String[] args) {
    int n = 100;
    System.out.println("We have to calculate of first 100 Natural Numbers Sum");
    Sum(n);
    System.out.println("The Sum of 100 natural number is : "+Sum(n));
 }
}
