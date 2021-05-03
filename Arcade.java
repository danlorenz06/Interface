package com.arcade;

public class Arcade implements Coins, GameStart {
	int coins;
	
	public Arcade() {
		this.coins=5;
	}
	@Override
	public boolean CoinInsert() {
		if(this.coins > 0) {
			this.startgame();
		
			return true;
		}
		return false;
	}
	
	@Override
	public void startgame() {
		this.coins--;
		
	} 
	

}
