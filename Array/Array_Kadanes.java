package Array;
public class Array_Kadanes {
    public static void kadanes(int array[]) {
        int cs = 0;
        int ms = Integer.MIN_VALUE;

        for (int index = 0; index < array.length; index++) {
            cs = cs + array[index];
            if (cs<0) {
                cs = 0;
                // System.out.println("Max sum is negative = "+ms);
            }
            
            ms = Math.max(cs, ms);       // a function which define max number in java ........
        }
        System.out.println("Max sum is = "+ms);

    }

    public static void main(String[] args) {
        int array[] = { -2, 3, -4, -1, 2, -1, 5, -3 };
        kadanes(array);
    }
}
