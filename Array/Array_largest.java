// Largest number in Array
// in java -infinity = Interger.MIN_VALUE
package Array;
public class Array_largest {
    public static int Getlargest(int number[]){
      int largest = Integer.MIN_VALUE; 
      int smallest = Integer.MAX_VALUE;
      for (int index = 0; index < number.length; index++) {
        if (largest<number[index]) {
           largest=number[index];
        }
        if (smallest>number[index]) {
            smallest=number[index];
         
         }
        
      }
      System.out.println("The Smallest number is in an Array = "+smallest);
      
      return largest ;
    }
   
    public static void main(String[] args) {
        int number[]={2,3,6,7,1,0};
       System.out.println("The Largest number is in an Array  = "+Getlargest(number));
      
    }
}
