package fr.pizzeria.console.PizzeriaAdminConsoleApp;

import java.util.Scanner;

import fr.pizza.exception.SavePizzaException;
import fr.pizzeria.model.pizza.Pizza;
import fr.pizzeria.model.pizza.PizzaDao;


/**Classe qui permet l'ajout d'une nouvelle pizza
 * @author Axel B.
 *
 */
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
		System.out.println("Veuillez choisir la catégorie :"+"\n");
		String cat = scanner.next();
		if (!lesPizzas.PizzaExists(co)){
		lesPizzas.saveNewPizza(new Pizza(co, no, p , cat));
		}else{
		throw new SavePizzaException("Impossible d'ajouter la pizza");
		}
	}

	


}
