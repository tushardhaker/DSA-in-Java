
package DivideConquer;
public class Divide_conquer_Quick_sort {
    public static void printArrayfor(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void QuickSort(int arr[], int si, int ei){
        if(si>=ei){
            return;
        }
        // Last Element
        int Pindx = Partition(arr, si, ei);
        QuickSort(arr, si, Pindx-1); // left part
        QuickSort(arr, Pindx+1, ei); // right part

        }
        public static int Partition(int arr[], int si, int ei){
            int pivot = arr[ei];
            int i = si-1; // jagaha banana

            for(int j =si; j<ei; j++){
                if(arr[j]<=pivot){
                    i++;
                    // swap
                    int temp = arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
            i++;
            // swap
            int temp = pivot;
            arr[ei]=arr[i];
            arr[i]=temp;

            return i;
        }
    

    public static void main(String[] args) {
        int arr[] = { 5, 6, 1, 3, 7, 4 };
        printArrayfor(arr);
        QuickSort(arr, 0, arr.length-1);
        printArrayfor(arr);
    }
}
