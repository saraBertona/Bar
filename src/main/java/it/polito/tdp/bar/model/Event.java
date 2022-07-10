 package it.polito.tdp.bar.model;

import java.time.Duration;

public class Event implements Comparable<Event>{
//	devo ordinare in base alla priorità (da tempo 0 in avanti)

//	capire quanti e quali eventi ho, in questo caso ho
//	gente che entra gente esce
	
	public enum EventType{
		ARRIVO_GRUPPO_CLIENTI,
		TAVOLO_LIBERATO
	}
	
//	simulazione parte da tempo 0, senza mettere date. potrei usare un int
	private Duration time; //javaTime	
	private EventType type;
	private int nPersone;
	private Duration durata;
	private Double tolleranza;
	
	private Tavolo tavolo;

	public Event(Duration time, EventType type, int nPersone, Duration durata, Double tolleranza, Tavolo tavolo) {
		super();
		this.time = time;
		this.type = type;
		this.nPersone = nPersone;
		this.durata = durata;
		this.tolleranza = tolleranza;
		this.tavolo = tavolo;
	}

	public Duration getTime() {
		return time;
	}

	public EventType getType() {
		return type;
	}

	public int getnPersone() {
		return nPersone;
	}

	public Duration getDurata() {
		return durata;
	}

	public Double getTolleranza() {
		return tolleranza;
	}

	public Tavolo getTavolo() {
		return tavolo;
	}

	@Override
	public int compareTo(Event o) {
		return this.time.compareTo(o.getTime());
	} //priorita temporale

	public void setTavolo(Tavolo tavolo) {
		this.tavolo = tavolo;
	}

	
	
	
	
	
}
