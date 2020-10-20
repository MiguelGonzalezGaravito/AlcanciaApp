package PiggyBankBussines;

import java.time.LocalDate;


public class Coin {
	
	private int value;
	private LocalDate fecha;
	
	
	public Coin() {

	}


	public Coin(int value, LocalDate fecha) {
		super();
		this.value = value;
		this.fecha = fecha;
	}


	public int getValue() {
		return value;
	}


	public void setValue(int value) {
		this.value = value;
	}


	public LocalDate getFecha() {
		return fecha;
	}


	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	
	
	
	
	
	
	

}
