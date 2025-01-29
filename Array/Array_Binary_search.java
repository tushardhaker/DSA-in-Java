// Binary Search......
package Array;
public class Array_Binary_search {
    public static int Binary_search(int number[], int key) {
        int start = 0, end = number.length - 1;

        while (start <= end) { // <= ye wo wala case he jisme array bilkul chota ho jata hai mtlb hae single
                               // element ki value check hogi
            int mid = (start + end) / 2;
            if (number[mid] == key) { // found
                return mid;
            }
            if (number[mid] < key) { // right
                start = mid + 1;
            }

            // Time-Complexity(TC) isme iteration hoti mtlb hamne loop ko array me kitni bar search kiya he.
            // Binary search ki TC proptational hogi Log base 2 , n hai ,,,,o(n)
            // for example n=8 ke liye linear search ki TC hogi 0(8) jabki binary search ki TC
            // hogi 0(8),0(4),0(2),o(1) tak mtlb hm keh skte hai BS(TC) is better than LS(TC)........

            else { // left
                start = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int number[] = { 4, 5, 8, 44, 23, 99, 1 };
        int key = 44;
        System.out.println("Index of key is = " + Binary_search(number, key));
    }
}
