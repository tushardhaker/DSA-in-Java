package ArrayList;
import java.util.ArrayList;

public class ArrayList_Largest {
    public static void main(String[] args) {
        ArrayList<Integer> List = new ArrayList<>();
        List.add(2);
        List.add(5);
        List.add(9);
        List.add(3);
        List.add(6);
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < List.size(); i++){
            // if (max<List.get(i)) {
            //     max = List.get(i);
                
            // }
            max = Math.max(max,List.get(i));
        }
        System.out.println("Max Element is : "+max);
    }
}
