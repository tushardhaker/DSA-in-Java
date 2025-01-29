package Array;
public class Array_max_sub_sum {
    public static void max_sub_sum(int array []){
        int currentSUM=0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
           int start = i;
           
           for (int j= 0; j < array.length; j++) {
            int end = j;
           currentSUM = 0; 
           for (int k = start; k <= end; k++) {
              currentSUM+=array[k];        // sum sub array
           }
           System.out.println(currentSUM);
           if (maxSum<currentSUM) {
            maxSum=currentSUM;
            
           }
           }
        }
        System.out.println("max sum is  = "+maxSum);

    }
    public static void main(String[] args) {
        int array [] = {2,4,6,8,10};
        max_sub_sum(array);
    }
}
