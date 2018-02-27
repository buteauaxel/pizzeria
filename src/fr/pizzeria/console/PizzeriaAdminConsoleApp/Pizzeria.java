package fr.pizzeria.console.PizzeriaAdminConsoleApp;

import java.util.Scanner;

import fr.pizza.exception.PizzaException;
import fr.pizzeria.model.pizza.PizzaDao;
import fr.pizzeria.model.pizza.PizzaMemDao;

/**
 * @author Axel B.
 *
 */
public class Pizzeria {

	public static void main(String[] args) {

		PizzaDao lesPizzas = new PizzaMemDao();
		Scanner questionUser = new Scanner(System.in);
		 
		int choix = 0;

		lesPizzas.init();
											
		do {
			
		MenuService mS; 	
		 	/** Initialisation du tableau */
		System.out.println("***** Pizzeria Administration *****"+"\n");
		System.out.println("1. Liste des pizzas ");
		System.out.println("2. Ajouter une nouvelle pizza");
		System.out.println("3. Mettre à jour une pizza");
		System.out.println("4. Supprimer une pizza");
		System.out.println("5. Créer un pdf des pizzas");
		System.out.println("99.Sortir ");
		choix = questionUser.nextInt();
		
		/** Gere les erreurs de l'utilisateur sur executeUc() */
		try
	
		{
		mS = MenuServiceFactory.getInstance(choix);	
		mS.executeUC(questionUser, lesPizzas);
	
		}catch (PizzaException e){
			System.err.println(e.getMessage()); /** Retourne un message d'erreur  en fonction du choix de l'utilisateur */
			
		}
		} while ( choix != 99);
		questionUser.close();
	}
}
