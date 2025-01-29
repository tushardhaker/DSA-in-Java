
package BasicSortingAlgo;
public class BSA_Bubble_sorting {
    public static void bubble_sort(int array[]) {
        int swap = 0;
            // outer loop
        for (int turn = 0; turn < array.length - 1; turn++) {
            // inner loop
            for (int j = 0; j < array.length - 1 - turn; j++) {
                // checking condion
                if (array[j] > array[j + 1]) {
                    // swap the element
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    
                    
                }
                swap+=j;
            }
         
           
        }
        System.out.println("Total Swapping is = "+ swap);
    }

    public static void printArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int array[] = { 5, 4, 1, 3, 2 };
        bubble_sort(array);
        printArray(array);
    }
}
