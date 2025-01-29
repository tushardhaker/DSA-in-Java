package Array;
public class Array_prefix {
    public static void prefixSum(int array[]) {

        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[array.length];
        prefix[0] = array[0];
        // calculate prifix sum.....
        for (int i = 1; i < array.length; i++) {
            prefix[i] = prefix[i - 1] + array[i];
        }

        for (int i = 0; i < array.length; i++) {
            int start = i;
            for (int j = 0; j < array.length; j++) {
                int end = j;
                currentSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                if (maxSum < currentSum) {
                    maxSum = currentSum;
                }

            }
        }
        System.out.println("Max sum is = " + maxSum);

    }

    public static void main(String[] args) {
        int array[] = { 2, 4, 6, 8, 10 };
        prefixSum(array);

    }
}
