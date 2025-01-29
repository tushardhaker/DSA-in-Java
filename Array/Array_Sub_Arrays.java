package Array;
public class Array_Sub_Arrays {
    // sub_array ---> 2,4,6,8,10 continuous number.
    public static void subarrays(int number[]) {

        int Total_Sub_Arrays = 0;
        for (int i = 0; i < number.length; i++) {
            int start = i;

            for (int j = i; j < number.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(number[k] + " ");

                }

                System.out.println();
                Total_Sub_Arrays++;

            }
            System.out.println();
        }
        System.out.println("Number of total sub arrays are = " + Total_Sub_Arrays);

    }

    public static void main(String[] args) {
        int number[] = { 2, 4, 6, 8, 10 };
        subarrays(number);
    }
}
