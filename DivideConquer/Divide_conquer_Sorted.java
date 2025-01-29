package DivideConquer;
public class Divide_conquer_Sorted {
    public static int search(int array[], int target, int si, int ei) {
        int mid = si + (ei - si) / 2;
        // Base Case
        if (si > ei) {
            return -1;
        }
        if (array[mid] == target) {
            return mid;
        }
        // Case 1 on line 1
        if (array[si] <= array[mid]) {
            // Case A
            if (array[si] <= target && target <= array[mid]) {
                return search(array, target, 0, mid - 1);
            } else {
                // Case B
                return search(array, target, mid + 1, ei);
            }
        }
        // Case 2 on line 2
        else {
            // Case C
            if (array[mid] <= target && target <= ei) {
                return search(array, target, mid + 1, ei);
            }
            // Case D
            else {
                return search(array, target, si, mid - 1);
            }
        }
    }

    public static void main(String[] args) {
        int array[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 7;
        System.out.print("Original Array is : ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Target Index is   : " + search(array, target, 0, array.length));
    }
}
