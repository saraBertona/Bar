package it.polito.tdp.bar.model;

public class Statistiche {

	private int clientiTot;
	private int clientiSoddisfatti;
	private int clientiInsoddisfatti;
	
	
	public Statistiche() {
		super();
		this.clientiTot = 0;
		this.clientiSoddisfatti = 0;
		this.clientiInsoddisfatti =0;
	}
	
	
	public int getClientiTot() {
		return clientiTot;
	}
	public void incrementaClienti(int n) {
		this.clientiTot += n;
	}
	public int getClientiSoddisfatti() {
		return clientiSoddisfatti;
	}
	public void incrementaSoddisfatti(int n) {
		this.clientiSoddisfatti +=n;
	}
	public int getClientiInsoddisfatti() {
		return clientiInsoddisfatti;
	}
	public void incrementaInsoddisfatti(int n) {
		this.clientiInsoddisfatti += n;
	}
	
	
	
}
