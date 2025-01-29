package ArrayList;
import java.util.ArrayList;

public class ArrayList_swap {
    public static void main(String[] args) {
        int index1 = 1; int index2 = 4;
         ArrayList<Integer> List = new ArrayList<>();
        List.add(2);
        List.add(5);
        List.add(9);
        List.add(3);
        List.add(6);
        System.out.println("Before Swapping : "+List);
        int temp = List.get(index1);
        List.set(index1, List.get(index2));
        List.set(index2, temp);
        System.out.println("After  Swapping : "+List);
    }
}
