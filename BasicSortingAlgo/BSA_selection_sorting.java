package BasicSortingAlgo;
public class BSA_selection_sorting {
    public static void selection_sort(int array []) {
//  outer loop
for (int i = 0; i<array.length-1; i++) {
    int Min_position = i;
    // inner loop
    for(int j = i+1; j<array.length; j++) {
        if (array[Min_position]>array[j]) {
            Min_position=j;
        }
        // Swap
        int temp = array[Min_position];
        array[Min_position]=array[i];
        array[i] = temp;
        
    }
}

    }
    public static void printArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int array[] = {5,4,1,3,2};
        selection_sort(array);
        printArray(array);

    }
}
