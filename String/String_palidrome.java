package String;
import java.util.Scanner;

public class String_palidrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "racecar" ;
      
        for(int i = 0; i<name.length()/2; i++){
            if (name.charAt(i)==name.charAt(name.length()-1-i)) {
                System.out.println("It is palidrome");
        }
         
        
        else{
            System.out.println("no");
        }
        
       
    }
   
}
}
