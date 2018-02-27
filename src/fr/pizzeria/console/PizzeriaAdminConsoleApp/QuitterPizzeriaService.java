package fr.pizzeria.console.PizzeriaAdminConsoleApp;


import java.util.Scanner;

import fr.pizzeria.model.pizza.PizzaDao;

public class QuitterPizzeriaService extends MenuService{

	@Override
	public void executeUC(Scanner scanner,PizzaDao pizzaDao ) {
		System.out.print("Au revoir ! ");
		
	}
	

}
