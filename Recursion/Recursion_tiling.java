package Recursion;
public class Recursion_tiling {
    public static int Tile(int n) {
        // Base Case
        if (n == 0 || n == 1) {
            return 1;
        }
        // Vertical Choice
        int vertical = Tile(n - 1);
        // Horizontal choice
        int horizontal = Tile(n - 2);

        int Total_Ways = vertical + horizontal;
        return Total_Ways;
    }

    public static void main(String[] args) {
        System.out.println("Number of Ways for 2xN Board is : " + Tile(4));
    }
}
