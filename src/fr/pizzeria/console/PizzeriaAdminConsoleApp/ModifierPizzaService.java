package fr.pizzeria.console.PizzeriaAdminConsoleApp;

import java.util.Scanner;

import fr.pizza.exception.PizzaException;
import fr.pizza.exception.UpdatePizzaException;
import fr.pizzeria.model.pizza.Pizza;
import fr.pizzeria.model.pizza.PizzaDao;

public class ModifierPizzaService extends MenuService{

	@Override
	public void executeUC(Scanner scanner ,PizzaDao lesPizzas) throws UpdatePizzaException{
		Scanner questionUser = new Scanner(System.in);
		
		System.out.println("3. Mettre à jour une pizza"+"\n");
		System.out.println("Veuillez choisir le code de la pizza à modifier :"+"\n"+"\n");
		
		String codeP = questionUser.next();

			if (lesPizzas.PizzaExists(codeP)){
				System.out.println("Veuillez choisir le nouveau code  :"+"\n");
				String code = questionUser.next();
				System.out.println("Veuillez choisir le nouveau nom ( sans espace ) :"+"\n");
				String nom = questionUser.next();
				System.out.println("Veuillez choisir le nouveau prix :"+"\n");
				 double prix = questionUser.nextDouble();
				 lesPizzas.updatePizza( codeP , new Pizza (code, nom, prix));
			}else{
				 
				 throw new UpdatePizzaException("Impossible de modifer la pizza");	}

	}


	

}
