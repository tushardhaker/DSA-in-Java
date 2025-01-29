package Recursion;
public class recursion_factorial {
    public static int print(int n ){
        if(n==0){
            return 1;
        }
        int factNM1 = print(n-1);
        int fact = n*factNM1;
    
        return fact;
    
    }
    public static void main(String[] args) {
        int n = 6;
        print(n);
        System.out.println( print(n));
    }
}
