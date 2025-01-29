package BackTracking;

public class Back_tracking_subsets {
    public static void findSubSet(String str, String ans, int i) {
        // Base Case
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("Null");
            } else {
                System.out.println(ans);
            }
           
            return;
        }

        // Recursion Case
        // Yes Choice
        findSubSet(str, ans + str.charAt(i), i + 1);

        // No Choice
        findSubSet(str, ans, i + 1);

    }

    public static void main(String[] args) {
        String str = "abc";
        findSubSet(str, "", 0);
    }
}
