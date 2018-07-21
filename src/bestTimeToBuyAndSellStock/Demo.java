package bestTimeToBuyAndSellStock;

/**
 * 
 * @author reggie
 *
 */
public class Demo {
	/**
	 * Say you have an array for which the ith element is the price of a given stock
	 * on day i.
	 * 
	 * If you were only permitted to complete at most one transaction (i.e., buy one
	 * and sell one share of the stock), design an algorithm to find the maximum
	 * profit.
	 * 
	 * Note that you cannot sell a stock before you buy one.
	 * 
	 * 
	 * @param prices
	 * @return
	 */
	public int maxProfit(int[] prices) {
		int sell = 0, profit = 0;
		for (int i = prices.length - 1; i >= 0; i--) {
			if (prices[i] > sell)
				sell = prices[i];
			else if (sell - prices[i] > profit)
				profit = sell - prices[i];
		}
		return profit;
	}
}
