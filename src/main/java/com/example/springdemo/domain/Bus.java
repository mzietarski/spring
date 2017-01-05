package com.example.springdemo.domain;


public class Bus {
	
	private int id;
	private String nrlini;
	private String marka;
	
	private int mechanik;
	
	
	
	public Bus(String nrlini, String marka, int mechanik)
	{
		this.nrlini = nrlini;
		this.marka = marka;
		this.mechanik = mechanik;
	}
	
	public Bus(String nrlini, String marka)
	{
		this.nrlini = nrlini;
		this.marka = marka;
	}

	//METODY POBIERAJ¥CE
	public int pobierzId() {
		return id;
	}
	
	public String pobierzNrlini() {
		return nrlini;
	}
	
	public String pobierzMarka() {
		return marka;
	}	
	
	public int pobierzMechanik() {
		return mechanik;
	}
	
	//METODY USTAWIAJ¥CE
	public void ustawId(int id) {
		this.id = id;
	}
	
	public void ustawNrlini(String nrlini) {
		this.nrlini = nrlini;
	}
	
	public void ustawMarka(String marka) {
		this.marka = marka;
	}
	
	public void sustawMechanik(int mechanik) {
		this.mechanik = mechanik;
	}
	
}
