package it.polito.tdp.bar.model;

public class Tavolo {

	private int posti;
	private boolean occupato;
	
	public Tavolo(int posti, boolean b) {
		super();
		this.posti = posti;
		this.occupato = b;
		
	}

	public int getPosti() {
		return posti;
	}

	public void setPosti(int posti) {
		this.posti = posti;
	}

	public boolean isOccupato() {
		return occupato;
	}

	public void setOccupato(boolean occupato) {
		this.occupato = occupato;
	}
	
	
}
