package com.sjsu;

public class MinimumNoOfCoins {
	
	int minNoOfCoin = 0;
	public void findNoOfCoins(int[] coins, int desiredAmt){
		int maxDenominationPosition=0;
		while(desiredAmt>0){
			int temp=desiredAmt/coins[maxDenominationPosition];
			if(temp>=1)
				minNoOfCoin += temp;
			desiredAmt = desiredAmt%coins[maxDenominationPosition];
					maxDenominationPosition++;
		}
		System.out.println("Minimum no of Coins:"+minNoOfCoin);
	}
	public static void main(String args[]){
		int[] coins = {500,100,50,10,5,2};
		MinimumNoOfCoins mn = new MinimumNoOfCoins();
		mn.findNoOfCoins(coins, 374);
		
	}

}
