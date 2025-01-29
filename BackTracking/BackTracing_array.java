package BackTracking;
public class BackTracing_array {
    public static void printArray(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void ChangeArray(int arr[], int i , int value){
        // Base Case
        if(i==arr.length){
            printArray(arr);
            return;
        }
        // Recursion Call
        arr[i]=value;
        ChangeArray(arr, i+1, value+1); // function call step
        arr[i]=arr[i]-2; // backtracking step
    }
    public static void main(String[] args) {
        int arr[] = new int [5];
        ChangeArray(arr, 0, 1);
        printArray(arr);
    }
}
