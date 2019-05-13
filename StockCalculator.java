package Demos;

public class StockCalculator {
	// Stock Purchase & CD Calculator 
	// You are feeling lucky with a stock and want to go all in! You have $25,000 in savings and want to invest all your money to buy a stock, and the remaining money in a CD account. The stock price is $989 per share. How many shares of this stock can you buy, and how much money will be left for the CD account? 
	// RESULT:    Buy 25 shares of stock 
	// Invest $275 in CD account

	public static void main(String[] args) {
		
		//Defining variables
		Integer initialInvestment = 25000;
		Integer stockPrice = 989;
		Integer stockPurchase = initialInvestment / stockPrice;
		Integer totalPurchase = stockPurchase * stockPrice; 
		Integer remainingMoney = initialInvestment - totalPurchase;
		
		// Creating the Calculator
		System.out.println("RESULT: Buy " + stockPurchase + " shares of stock");
		System.out.println("You will have " + remainingMoney + " to invest in a CD Account");
		
		
	}
}
