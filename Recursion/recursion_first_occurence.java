
package Recursion;
public class recursion_first_occurence {
    public static int occurence(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return occurence(arr, key, i + 1);

    }

    public static int lastoccurence(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        int isFound = lastoccurence(arr, key, i + 1);
        if (arr[i] == key && isFound == -1) {
            return i;
        }

        return isFound;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 7, 3, 2, 5, 2, 4 };
        int key = 2;
        // System.out.println("Index is : "+occurence(arr, 2, 0));
        System.out.println("Last Occurence is : " + lastoccurence(arr, 2, 0));
    }
}
