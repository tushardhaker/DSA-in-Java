package ArrayList;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayLisr_Sort {
    public static void main(String[] args) {

        ArrayList<Integer> List = new ArrayList<>();
        List.add(2);
        List.add(5);
        List.add(9);
        List.add(3);
        List.add(6);
        System.out.println("Initial list   : "+List);
        Collections.sort(List); // Ascending Order
        System.out.println("Final list     : "+List);
        // Descending Order
        Collections.sort(List,Collections.reverseOrder());
        System.out.println("Desending list : "+List);
    }
}
