package fr.pizzeria.model.pizza;

public class Pizza {
	int id;
	int code;
	String libelle;
	int prix;
	
	public Pizza(int id, int code, String libelle, int prix) {
		super();
		this.id = id;
		this.code = code;
		this.libelle = libelle;
		this.prix = prix;
	}
	
	public Pizza(int code, String libelle, int prix) {
		super();
		this.code = code;
		this.libelle = libelle;
		this.prix = prix;
	}
	


}
