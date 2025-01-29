package Array;
public class Array_Buy_Sell_stock {
    public static void Buyandsell(int prices []) {
        int buyPrice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++ ) {
            if (buyPrice<prices[i]) {
                int profit = prices[i]-buyPrice;
                maxprofit = Math.max(maxprofit,profit); // Max profit
            }
            else {
                buyPrice=prices[i];
            }
        }
        System.out.println("Max profit is = "+maxprofit);
    }

    public static void main(String[] args) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };
        Buyandsell(prices);
    }
}
