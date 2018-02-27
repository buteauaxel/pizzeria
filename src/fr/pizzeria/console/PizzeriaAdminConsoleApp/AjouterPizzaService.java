package fr.pizzeria.console.PizzeriaAdminConsoleApp;

import java.util.Scanner;

import fr.pizza.exception.SavePizzaException;
import fr.pizzeria.model.pizza.Pizza;
import fr.pizzeria.model.pizza.PizzaDao;


public class AjouterPizzaService extends MenuService{

	@Override
	public void executeUC(Scanner scanner,PizzaDao lesPizzas) throws SavePizzaException {
		
		
		
		
		
		System.out.println("2. Ajouter une nouvelle pizza "+"\n ");
		
		System.out.println("Veuillez saisir le code :"+"\n");
		String co = scanner.next();
		System.out.println("Veuillez saisir le nom (sans espace) :"+"\n");
		String no = scanner.next();
		System.out.println("Veuillez saisir le prix :"+"\n");
		double p = scanner.nextInt();
		if (!lesPizzas.PizzaExists(co)){
		lesPizzas.saveNewPizza(new Pizza(co, no, p ));
		}else{
		throw new SavePizzaException("Impossible d'ajouter la pizza");
		}
	}

	


}