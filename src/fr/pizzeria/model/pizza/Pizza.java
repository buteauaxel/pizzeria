package fr.pizzeria.model.pizza;

import fr.pizzeria.utils.StringUtils;
import fr.pizzeria.utils.ToString;

/**
 * @author Axel B.
 *
 */

public class Pizza {
	
	/** id : int
	 * 
	 */
	int id;
	
	/** code : String
	 * 
	 */
	@ToString(before=" ", after="-> ")
	String code;
	
	/** libelle : String
	 * 
	 */
	@ToString(before=" " , after=" (")
	String libelle;
	
	/** prix : double
	 * 
	 */
	@ToString(before=" ", after = "€)")
	double prix;
	
	/** categ : String
	 * 
	 */
	String categ;
	
	static int compteur=0;
	
	
	
	/** Constructor
	 * @param id
	 * @param code
	 * @param libelle
	 * @param prix
	 * @param categ
	 */
	public Pizza(int id, String code, String libelle, double prix, String categ) {
		super();
		this.id = id;
		this.code = code;
		this.libelle = libelle;
		this.prix = prix;
		this.categ=categ;
	}
	
	/** Constructor
	 * @param code
	 * @param libelle
	 * @param prix
	 * @param categ
	 */
	public Pizza(String code, String libelle, double prix, String categ) {
		super();
		
		
		this.code = code;
		this.libelle = libelle;
		this.prix = prix;
		this.categ=categ;
		this.id=compteur;
		compteur++;
	}
	
	
	
	/** Nouveau toString
	 * 
	 */
	public String toString() {
		return StringUtils.getStringValue(this);
	}
	
	/** Ancien toString
	 * @Override
	public String toString() {
		
		return (code + " -> "  + libelle + " (" + prix  + ") " + categ);
		
	} */

	/** Getter
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**Setter
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/** Getter
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**Setter
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/** Getter
	 * @return the libelle
	 */
	public String getLibelle() {
		return libelle;
	}

	/**Setter
	 * @param libelle the libelle to set
	 */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	/** Getter
	 * @return the prix
	 */
	public double getPrix() {
		return prix;
	}

	/**Setter
	 * @param prix the prix to set
	 */
	public void setPrix(double prix) {
		this.prix = prix;
	}

	/** Getter
	 * @return the compteur
	 */
	public static int getCompteur() {
		return compteur;
	}

	/**Setter
	 * @param compteur the compteur to set
	 */
	public static void setCompteur(int compteur) {
		Pizza.compteur = compteur;
	}

	

	
	


}
