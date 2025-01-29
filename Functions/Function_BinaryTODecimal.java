package Functions;

public class Function_BinaryTODecimal {
    public static void BinToDec(int BinNmunber){
        int myNum = BinNmunber;
        int pow = 0;
        int decimal = 0;
        while (BinNmunber>0) {
            int lastnumber = BinNmunber%10; // for finding remainder .
            decimal = decimal + (lastnumber*(int)Math.pow(2,pow));
            pow++;
            BinNmunber = BinNmunber/10;
           
        }
       
         System.out.println("Decimal no. of "+myNum +" is = "+decimal);


    }
    public static void DecToBin(int DeciNumber){
        int mynum = DeciNumber;
       int pow = 0;
       int binary = 0;
       while (DeciNumber>0) {
        int firstnumber = DeciNumber%2;
        binary = binary + (firstnumber*(int)Math.pow(2, pow));
        pow++;
        DeciNumber = DeciNumber/10;
       }
       System.out.println("Binary Number of "+mynum+ " is = "+binary);
    }
    public static void main(String[] args) {
        BinToDec(1010);
        DecToBin(1010);
    }
}
