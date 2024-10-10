public class main {

  public static void main(String[] args) {
    int[] prices = new int[] { 1, 2, 3, 4 };
    maxProfit(prices);
  }

  public static int maxProfit(int[] prices) {
    int min = 100000;
    int profit = 0;
    for (int i = 0; i < prices.length; i++) {
      if (prices[i] < min) {
        min = prices[i];
      } else if (prices[i] - min > profit)
        profit = prices[i] - min;

    }
    return profit;

  }
}
