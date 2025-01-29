package Functions;
import java .util.*;
public class fuction_overloading_prime {
    public static boolean prime(int n){
        boolean prime = true;
        
      for (int index = 2; index <=(n-1); index++) {
        if (n%index==0) {
           
            // System.out.println("Not a prime");
            
            return false;
        }
        // else{
        //     System.out.println("Prime number !");
        //     break;
        // }
        
      }
      return prime;
    }
    public static void RangePrime(int n){
        for (int index = 2; index <= n; index++) {
           if (prime(index)) {
            System.out.println(index + " ");
            
           } 
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a number n = ");
        // int n = sc.nextInt();

        // System.out.println(prime(20));
        System.out.println("Range of prime Number - ");
        RangePrime(20);
    }
}
