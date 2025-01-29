package Recursion;
public class recursion_power {
    public static int power(int a, int n) {
        if (n == 0) {
            return 1;
        }
        int half = power(a, n / 2);
        int halfSQ = half * half;
        if (n % 2 != 0) {
            return a * halfSQ;
        }
        return halfSQ;
    }

    public static void main(String[] args) {
        int a = 2;
        int n = 6;
        System.out.println(power(a, n));
    }
}
