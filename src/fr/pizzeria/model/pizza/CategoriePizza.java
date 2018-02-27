
package fr.pizzeria.model.pizza;

/**
 * @author Axel B.
 *
 */
public enum CategoriePizza {
	/** VIANDE : CategoriePizza
	 * 
	 */
	VIANDE ("Viande"), 
	/** POISSON : CategoriePizza
	 * 
	 */
	POISSON("Poisson"), 
	/** SANS_VIANDE : CategoriePizza
	 * 
	 */
	SANS_VIANDE("Sans Viande");
	
	/** categ : String
	 * 
	 */
	private String categ;
	
	/** Constructor
	 * @param categ
	 */
	private CategoriePizza (String categ){
		this.categ = categ;
	}

	/** Getter
	 * @return the categ
	 */
	public String getCateg() {
		return categ;
	}
	
}
/** 1 - Pour retrouver un �l�ment de l'�num�ration en fonction de son nom, on utilise getValue(); 
 */
/** 2-  Pour retrouver un �l�ment de l'�num�ration en fonction de son libelle, on utilise getValueOff(); 
 */
