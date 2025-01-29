package String;
import java.util.Scanner;

public class String_input {
  

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        // name = sc.next();
       
        System.out.println("Enter your name = "+name);
        System.out.println("Name length is = " +name.length());

        String S1 = "Tushar";
        String S2 = new String ("Tushar");
        if (S1.equals(S2)) {
            System.out.println("Strings are equal");
        }
        else {
            System.out.println("Not equal");
        }
    }
}
