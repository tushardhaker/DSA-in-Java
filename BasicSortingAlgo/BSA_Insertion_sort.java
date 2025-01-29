package BasicSortingAlgo;
public class BSA_Insertion_sort {
    public static void insertion(int array []) {
        
      for (int  i = 1;  i < array.length; i++) {
          int current = array[i];
          int previous = i-1;
            while (previous>=0 && array[previous]>current) {
                array[previous+1]=array[previous];
                previous--;
            }
          array[previous+1]=current;
      }
    }
    public static void printArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int array[] = { 5, 4, 1, 3, 2 };
        insertion(array);
        printArray(array);
    }
}
