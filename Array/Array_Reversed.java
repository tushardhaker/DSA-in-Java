package Array;
public class Array_Reversed {
    public static void Reverse(int number[]){
        int start=0 ,end=number.length-1;
        while (start<end) {
            int temp;
            // Swap.........
            temp = number[end];
            number[end]=number[start];
            number[start]=temp;
            
            start++;           
            end--;         // start ko 1-1 step aage badaenge or end ko kam krenge....
        }
    }
    public static void main(String[] args) {
        int number[]={4,2,8,6,10};

        Reverse(number);
        for (int index = 0; index < number.length; index++) {
            System.out.print(number[index]+" ");
        }
    }
}
