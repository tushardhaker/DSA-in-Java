package BackTracking;
public class Backtracking_GridWays {
    public static int gridWays(int i, int j, int n, int m) {
        // base case
        if (i == n - 1 && j == m - 1) {
            return 1;
        }
        // boundary cross condition
        if (i == n || j == m) {
            return 0;
        }
        // Recursive case
        int w1 = gridWays(i, j + 1, n, m);
        int w2 = gridWays(i + 1, j, n, m);
        return w1 + w2;
    }

    public static void main(String[] args) {
        int n = 3, m = 3;
        System.out.println("Total Ways are : "+ gridWays(0, 0, n, m));
    }
}
