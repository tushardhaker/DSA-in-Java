package Array;
public class Array_as_Arugument {
    public static void update(int marks[],int nonchangable){
            //   IT will take array as argument.
            // Argument - it is the values passed when function is called.called
            nonchangable=10;
            for (int index = 0; index < marks.length; index++) {
                marks[index] = marks[index]+1;
                System.out.println(""+ marks[index]);
            }
    }
    public static void main(String[] args) {
        // Passing arrays as arugment - there are two methods..
        // 1. pass by value   2.by reference
        int nonchangable = 5;
        int marks[]={90,91,92};            // Array ko update function change kr diya toh iski value change hogyi lekin 
                                           // nonchangable function ko chane kiya fir bhi change nhi hui hai.....
        update(marks,nonchangable);
        System.out.println(nonchangable);
    }
}
