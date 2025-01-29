package Recursion;
public class Recursion_String {
    public static void printString(int n , int LastPlace , String S ){
        // Base 
        if (n==0) {
            System.out.println(S);
            return;
        }
        // Work
     printString(n-1, 0, S+"0");
     if (LastPlace==0) {
        
        printString(n-1, 1, S+"1");
     }
    }
    public static void main(String[] args) {
        System.out.println("The total cases are : ");
        printString(3, 0, "");
    }
}
