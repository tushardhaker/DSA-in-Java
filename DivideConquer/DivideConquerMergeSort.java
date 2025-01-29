package DivideConquer;
public class DivideConquerMergeSort {

    // Method to print the array
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Merge Sort function
    public static void mergesort(int arr[], int si, int ei) {
        // Base case
        if (si >= ei) {
            return;
        }

        // Divide step
        int mid = si + (ei - si) / 2;

        // Recursively sort left and right halves
        mergesort(arr, si, mid);
        mergesort(arr, mid + 1, ei);

        // Merge sorted halves
        merge(arr, si, ei, mid);
    }

    // Merge function
    public static void merge(int arr[], int si, int ei, int mid) {
        // Temporary array to hold merged result
        int temp[] = new int[ei - si + 1];

        int i = si;       // Iterator for left part
        int j = mid + 1;  // Iterator for right part
        int k = 0;        // Iterator for temporary array

        // Merge elements from both halves
        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        // Add remaining elements from the left half
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // Add remaining elements from the right half
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // Copy merged elements back to the original array
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    // Main method
    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 5, -3, 2, 8};
        System.out.println("Original Array:");
        printArray(arr);

        mergesort(arr, 0, arr.length - 1);

        System.out.println("Sorted Array:");
        printArray(arr);
    }
}
