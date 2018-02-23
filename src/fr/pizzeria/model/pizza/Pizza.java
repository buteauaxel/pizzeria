package fr.pizzeria.model.pizza;

public class Pizza {
	int id;
	String code;
	String libelle;
	double prix;
	
	static int compteur=0;
	
	
	public Pizza(int id, String code, String libelle, double prix) {
		super();
		this.id = id;
		this.code = code;
		this.libelle = libelle;
		this.prix = prix;
	}
	
	public Pizza(String code, String libelle, double prix) {
		super();
		
		
		this.code = code;
		this.libelle = libelle;
		this.prix = prix;
		this.id=compteur;
		compteur++;
	}
	
	

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public static int getCompteur() {
		return compteur;
	}

	
	


}
