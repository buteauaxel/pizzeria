package fr.pizzeria.console.PizzeriaAdminConsoleApp;

import java.util.Scanner;

import fr.pizza.exception.UpdatePizzaException;
import fr.pizzeria.model.pizza.Pizza;
import fr.pizzeria.model.pizza.PizzaDao;

/**
 * @author Axel B.
 *
 */
public class ModifierPizzaService extends MenuService{

	@Override
	public void executeUC(Scanner scanner ,PizzaDao lesPizzas) throws UpdatePizzaException{
		
		
		System.out.println("3. Mettre à jour une pizza"+"\n");
		System.out.println("Veuillez choisir le code de la pizza à modifier :"+"\n"+"\n");
		
		String codeP = scanner.next();

			if (lesPizzas.PizzaExists(codeP)){
				System.out.println("Veuillez choisir le nouveau code  :"+"\n");
				String code = scanner.next();
				System.out.println("Veuillez choisir le nouveau nom ( sans espace ) :"+"\n");
				String nom = scanner.next();
				System.out.println("Veuillez choisir le nouveau prix :"+"\n");
				 double prix = scanner.nextDouble();
				 System.out.println("Veuillez choisir la nouvelle catégorie :"+"\n");
				 String categ = scanner.next();
				 lesPizzas.updatePizza( codeP , new Pizza (code, nom, prix,categ));
			}else	{			 
				 throw new UpdatePizzaException("Impossible de modifer la pizza, le code est erroné");	}

			
			
			
			
			
			
			
	}


	

}
