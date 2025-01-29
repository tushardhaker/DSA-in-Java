package ArrayList;
import java.util.ArrayList;

public class ArrayList_Operations {
    public static void main(String[] args) {
        // Syntax
        ArrayList<Integer> List = new ArrayList<>();
        ArrayList<String> List2 = new ArrayList<>();
        ArrayList<Boolean> List3 = new ArrayList<>();

        // Operations
        // 1. Add elements
        List.add(1);
        List.add(2);
        List.add(3);
        List.add(4);
        List.add(5);

        List.add(1,7);
        // Time Complexity is 0(1)........... big of one
        System.out.println("Stored Elements are = " + List);

        // 2. Get elements
        int element = List.get(3);
        System.out.println(element);

        // 3. Remove element
        List.remove(3);
        System.out.println("New Elements are = " + List);

        // 4. Set
        List.set(2, 10);
        System.out.println(List);

        // 5. Contains elements

        System.out.println(List.contains(10));
        System.out.println(List.contains(7));
        System.out.println(List.contains(11));

    }
}
