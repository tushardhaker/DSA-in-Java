package String;
public class String_SubString {
    public static String SubString(String Str, int SI, int EI) {
        String SubStr = "";
        for (int i = SI; i < EI; i++) {
            SubStr += Str.charAt(i);
        }
        return SubStr;
    }

    public static void main(String[] args) {
        String Str = "HelloTushar";
        System.out.println(SubString(Str, 0, 5));
        // By lexicography methods which compares letter by letter.
        String Fruit[] = { "Apple", "Banana", "Mango" };
        String largest = Fruit[0];
        for (int i = 1; i < Fruit.length; i++) {
            if (largest.compareTo(Fruit[i]) < 0) {
                largest = Fruit[i];
            }
        }
        System.out.println("Largest String is - "+largest);
    }
}
