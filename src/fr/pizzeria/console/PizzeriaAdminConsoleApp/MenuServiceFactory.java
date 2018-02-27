package fr.pizzeria.console.PizzeriaAdminConsoleApp;

public class MenuServiceFactory extends Pizzeria {
	

	

	public static MenuService getInstance(int choix) {
			
		MenuService mS = null; 
		
		switch(choix) {
		
		case 1 : 
				mS = new ListerPizzaService();
			break;
			
		case 2 :
			 	mS = new AjouterPizzaService();
			break;	
		case 3 :
			mS = new ModifierPizzaService();
			
			break;
			
		case 4 :
			mS = new SupprimerPizzaService();
			break;
		case 99 :	
			mS = new QuitterPizzeriaService();
			break;	
			default :
				//throw new PizzaException("";)
				
		} return mS;

}
}
