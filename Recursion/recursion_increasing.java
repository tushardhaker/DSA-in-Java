package Recursion;
public class recursion_increasing {
    public static void print(int n){
        if (n==11) {
            System.out.print(n);
            return;
        }
        System.out.print(n+"  ");
        print(n+1);
    }
    public static void main(String[] args) {
        int n = 1;
        print(n);
    }
}
