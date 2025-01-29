package Array;
public class Array_pairs {
    public static void pairs(int number[]){ 
        int Total_pair = 0;                                           // Pairs.......
       for (int i = 0; i < number.length; i++) {                       
        int current = number[i];                                     // (5,6)(5,7)(5,10)(5,2)
        for (int j= i+1; j < number.length; j++) {                   // (6,7)(6,10)(6,2)
            System.out.print("("+current +","+number[j]+")");  
            Total_pair++;                                           //  (7,10)(7,2)            
        }                                                           //(10,2)
                                                   
        System.out.println();                                      
       }    
       System.out.println("Number of Total Pairs is = "+Total_pair);   
        // j ki value i=0 index ke ek bad se start hogi tbhi pair banenge
    }
    public static void main(String[] args) {
        int number[]={5,6,7,10,2};
         pairs(number);
    }
}
