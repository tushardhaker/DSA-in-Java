package String;
public class String_Print_letters {
    public static void print_Letters(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + ",");
        }
    }

    public static void main(String[] args) {
        String First = "Tushar";
        String last = "Dhaker";

        String Full_Name = First + " " + last;
        System.out.println("Your Full Name is - " + Full_Name);
        print_Letters(Full_Name);
    }
}
