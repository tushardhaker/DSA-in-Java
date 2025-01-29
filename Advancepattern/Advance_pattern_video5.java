// print floyads triangle

// 1
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15

package Advancepattern;
public class Advance_pattern_video5 {
    public static void pattern(int n){
        int p = 1;
      
for (int i = 1; i <=n; i++) {
           for (int j = 1; j<= i; j++) {
            System.out.print(" "+p);
            p++;
           } 
           System.out.println(" ");
        }        
    }
    public static void patter1 (int n){ // 1 2 3 4 5
        // 1 2 3 4 5
        for (int i = 1; i <=n; i++) {               // 1 2 3 4
            for (int j = 1; j<= n-i+1; ++j) {       // 1 2 3
             System.out.print(" "+j);               // 1 2
                                                    // 1
            } 
            System.out.println(" ");
         }  
    }
    public static void patter2 (int n){
        
        for (int i = 1; i <=n; i++) {                   //   1
            for (int j = 1; j<= i; ++j) {               //   0 1
            if ((i+j)%2==0) {                           //   1 0 1
                System.out.print(" 1 ");              //   0 1 0 1
            }
            else {
                System.out.print(" 0 ");
            }
            
            } 
            System.out.println(" ");
         }  
    }
    public static void main(String[] args) {
        pattern(5);
        // patter1(5);
        // patter2(5);

    }
}  


