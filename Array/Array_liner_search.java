package Array;
public class Array_liner_search {
    public static int linerSearch(int numbers[],int key){
      for (int i = 0; i < numbers.length; i++) {
        if (numbers[i]==key) {
            // System.out.println("Value of key is "+numbers[i]+"\nkey index at "+i);
            return i;
        
      }
    }
    return -1;
}
    public static void main(String[] args) {
        int numbers[]= {2,5,23,56,10,76,8,9,0,6};
        int key = 10;
        linerSearch(numbers, key);
        int index = linerSearch(numbers, key);
        if (index== -1) {
            System.out.println("Not Found"); }
       else {
        System.out.println("Key index at "+index);
       }

    }
}

