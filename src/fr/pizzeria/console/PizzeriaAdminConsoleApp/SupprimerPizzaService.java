package fr.pizzeria.console.PizzeriaAdminConsoleApp;

import java.util.Scanner;

import fr.pizza.exception.DeletePizzaException;
import fr.pizzeria.model.pizza.Pizza;
import fr.pizzeria.model.pizza.PizzaDao;


public class SupprimerPizzaService extends MenuService{

	@Override
	public void executeUC(Scanner scanner,PizzaDao lesPizzas) throws DeletePizzaException{
		Scanner questionUser = new Scanner(System.in);
		 
		System.out.println("Veuillez choisir la pizza à supprimer  :"+"\n");
		for(Pizza pizza: lesPizzas.findAllPizzas()){
			System.out.println(pizza);
		};
		
		String codeS = questionUser.next();
		if (lesPizzas.PizzaExists(codeS)){	
			lesPizzas.deletePizza(codeS);
		}else{ throw new DeletePizzaException("Impossible de supprimer la pizza");
		}
		
		
			
		}

		
	}

	




