package com.arcade;

public class Machine {
		public static void main(String[]args) {
			Arcade arcademachine = new Arcade();
			Player player = new Player(5);
			
			player.CoinInsert(arcademachine, 0);
			player.CoinInsert(arcademachine, 0);
			player.CoinInsert(arcademachine, 0);
			player.CoinInsert(arcademachine, 0);		
			player.CoinInsert(arcademachine, 0);	

		
			
		}

	}
