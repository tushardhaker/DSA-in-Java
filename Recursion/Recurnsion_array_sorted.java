package Recursion;
public class Recurnsion_array_sorted {
    public static boolean isSorted(int array[], int i){
        if(i==array.length-1){
            return true;
        }
        if(array[i]>array[i+1]){
            return false;
        }
        return isSorted(array, i+1);
    }
    public static void main(String[] args) {
        int array[] = {4,5,6,7,8};
        System.out.println(isSorted(array, 0));
    }
}
