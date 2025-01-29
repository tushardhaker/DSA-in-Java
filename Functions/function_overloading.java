package Functions;
public class function_overloading {
    //  Function overloading with same name but different parameters.
    //  Fuction over loading parameters pr depend krti hai return type par nhi
    public static int sum(int a , int b){
        return a+b;
    }
    public static int sum(int a , int b,int c){
        return a+b+c;
    }                          // yha function overloading ho rhi hai 

    // public int sum1(int c , int d){
    //     return c+d;
    // }
    // public float sum1(int c , int d){
    //     return c+d;
    // }    // yha error show hoga kyu ki function name to same hai lekin parameters bhi change nhi huee


    public static void main(String[] args) {
      System.out.println(sum(3,4));
      System.out.println(sum(3,4,5));

    }
}
