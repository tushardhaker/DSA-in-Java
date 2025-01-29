package Functions;
//  two types methods --> user-defined , in-built 

public class Function_Method_video11{
    public static int factorial1(int n )
    {
        int f = 1;
        for (int index = 1; index <=n; index++) {
            f*=index;
        }
        return f;
        }
        public static int factorial2(int r){
            int s=1;
            for (int index = 1; index <=r; index++) {
                s*=index;
                                                     
            }
            return s;
        }
        public static int BC(int n , int r){
            int factN = factorial1(n);
            int factR = factorial2(r);
            int factNR = factorial1(n-r);

            int BC = factN/(factNR*factR);
            return BC;
        }
public static void main(String[] args) {
    System.out.println(BC(5,3 ));
}
}
