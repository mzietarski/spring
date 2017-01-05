package com.example.springdemo.domain;


public class Mechanik {
	
	private int id;
	private String imie;
	private String stanowisko;
	
	
	
	
	public Mechanik(String imie, String stanowisko)
	{
		this.imie = imie;
		this.stanowisko = stanowisko;
	}
	
	//POBIERANIE
	public int pobierzId() {
		return id;
	}
	
	public String pobierzImie() {
		return imie;
	}
	
	public String pobierzStanowisko() {
		return stanowisko;
	}
	
	//USTAWIANEI
	public void ustawId(int id) {
		this.id = id;
	}
	
	public void ustawImie(String imie) {
		this.imie = imie;
	}
	
	public void ustawStanowisko(String stanowisko) {
		this.stanowisko = stanowisko;
	}
	

}

