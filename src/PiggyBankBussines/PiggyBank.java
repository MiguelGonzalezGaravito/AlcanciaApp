package PiggyBankBussines;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

public class PiggyBank {

	private Collection<Coin> coins = new ArrayList<Coin>();


	public PiggyBank() {
		super();
	}
	
	
	public String insertCoin(int value){
		LocalDate localDate = LocalDate.now();
		
		Coin coin = new Coin(value,localDate);
		coins.add(coin);
		return "Moneda insertada con exito !!";
		
	}
	
	public int getTotalCoins(){
		return coins.size();
	}
	
	public int getTotalMoney(){	
		return this.coins.stream().mapToInt(total -> total.getValue()).sum();
	}
	
	public int getTotalCoinsDenomination(int denomination){
		return (int) coins.stream().filter(coin -> coin.getValue() == denomination).count();
	}
	
	public int getTotalCoinsDenominationMoney(int denomination){
		return  coins.stream().filter(coin -> coin.getValue() == denomination).mapToInt(total -> total.getValue()).sum();
	}
	


}
