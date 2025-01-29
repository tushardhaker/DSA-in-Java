package ArrayList;
import java.util.ArrayList;

public class ArrayList_paisum2 {
    public static boolean paisum2( ArrayList<Integer> List, int target){
        int Breaking_Point = -1;
        for(int i = 0; i < List.size(); i++){
            if(List.get(i)>List.get(i+1)){
                Breaking_Point=i;
                break;
            }
        }
        int LP = Breaking_Point+1; // Smallest element
        int RP = Breaking_Point;  // Largest element
        System.out.println("Breaking Point Index is : "+Breaking_Point);

        while (LP!=RP) {
            int sum = List.get(RP)+List.get(LP);
            int n = List.size();
            //case 1
            if (sum==target) {
                return true;
            }
            // case 2
            if (sum<target) {
             LP = (LP+1)%n;   
            } 
            // case 3
            else{
                RP = (RP+n-1)%n;
            }
        }

        return false;
    }
    public static void main(String[] args) {
         ArrayList<Integer> List = new ArrayList<>();
        //   11 15 6 7 8 9  Sorted and Rotated...........
        List.add(11);
        List.add(15);
        List.add(6);
        List.add(8);
        List.add(9);

        int target = 15;

        System.out.println(paisum2(List, target));

    }
}
