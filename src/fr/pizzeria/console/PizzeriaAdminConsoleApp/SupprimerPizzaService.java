package fr.pizzeria.console.PizzeriaAdminConsoleApp;

import java.util.Scanner;

import fr.pizza.exception.DeletePizzaException;
import fr.pizzeria.model.pizza.Pizza;
import fr.pizzeria.model.pizza.PizzaDao;


/**
 * Classe qui permet de supprimer une pizza de la liste 
 * @author Axel B.
 *
 */
public class SupprimerPizzaService extends MenuService{

	@Override
	public void executeUC(Scanner scanner,PizzaDao lesPizzas) throws DeletePizzaException{
		
		 
		System.out.println("Veuillez choisir la pizza à supprimer  :"+"\n");
		for(Pizza pizza: lesPizzas.findAllPizzas()){
			System.out.println(pizza);
		};
		
		String codeS = scanner.next();
		if (lesPizzas.PizzaExists(codeS)){	
			lesPizzas.deletePizza(codeS);
		}else{ throw new DeletePizzaException("Impossible de supprimer la pizza");/** Si le code de la pizza n'existe pas, on ne peut pas la supprier */
		}
		
		
			
		}

		
	}

	




