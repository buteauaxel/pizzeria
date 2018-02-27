package fr.pizzeria.console.PizzeriaAdminConsoleApp;

/**
 * @author Axel B.
 *
 */
public class MenuServiceFactory extends Pizzeria {

	/**
	 * @param choix
	 * @return 
	 */
	public static MenuService getInstance(int choix) {
			
		MenuService mS = null; 
		/** Switch permettant de suivre le choix de l'utilisateur */
		switch(choix) {
		
		case 1 : 
				mS = new ListerPizzaService(); /** Choix 1 : retourne la liste une pizza */
			break;
			
		case 2 :
			 	mS = new AjouterPizzaService();/** Choix 2  : Permet d'ajouter une pizza */
			break;	
		case 3 :
			mS = new ModifierPizzaService();/** Choix 3 : Permet de modifier une pizza */
			
			break;
			
		case 4 :
			mS = new SupprimerPizzaService();/** Choix 4 : Permet de supprimer une pizza */
			break;
		case 99 :	
			mS = new QuitterPizzeriaService();/** Choix 99 : Quitte l'application */
			break;	
			default :
				
				
		} return mS; /** Retourne le choix de l'utilisateur */

}
}
