package ArrayList;
import java.util.ArrayList;
public class ArrayList_Size {
    public static void main(String[] args) {
        ArrayList<Integer> List = new ArrayList<>();
        // List.add(1);
        // List.add(2);
        // List.add(3);
        // List.add(4);
        // List.add(5);
        // //Size of AL
        // System.out.println(List.size());

        // for(int i = 0; i < List.size(); i++){
        //     System.out.print(List.get(i));
        // }

        // print reverse
        List.add(1);
        List.add(2);
        List.add(3);
        List.add(4);
        List.add(5);
        System.out.print("Reverse Array List is : ");
         for(int i = List.size()-1; i >= 0; i--){
            System.out.print(List.get(i));
        }
    }
}
