package Recursion;
public class recursion_fibonacci {
    public static int fibonacci(int n){
        if(n==0){
            return 0;  
        }
        if(n==1){
            return 1;
        }
        int fibNM2 = fibonacci(n-2);
        int fibNM1 = fibonacci(n-1);
        int fib = fibNM1 + fibNM2;

        return fib;

    }
    public static void main(String[] args) {
        int n = 8;
        fibonacci(n);
        System.out.println(fibonacci(n));
    }
}
