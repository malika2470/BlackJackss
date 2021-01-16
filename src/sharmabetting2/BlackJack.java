/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sharmabetting2;

/**
 *
 * @author VIASVS
 */
public class BlackJack {
       // Will get the bets from the player
	public void getBet(){
		int betValue;
               
		
		 {  	
			if (player.getBank() > 0) {
			do {
				System.out.print("How much would you like to bet?" );
				betValue = input.nextInt();
				player.setBet(betValue);
			} while (!( betValue > 0 && betValue <= player.getBank()));
		
			}

		}

	}
    

// This code will add or remove the player bets
	public void addremoveBet() {
		

			if (player.getBet() > 0 ) {
				if( player.getTotal() > 21 ) {
					System.out.println(player + " has busted");
				} else if ( player.getTotal() < dealer.calculateTotal() && dealer.calculateTotal() <= 21 ) {
					System.out.println(player + " has lost");
				} else if (player.getTotal() == 21) {
					System.out.println(player + " has won blackjack!");
				} else {
					System.out.println(player + " has won");
					
				}
			}
		}
} 
    





