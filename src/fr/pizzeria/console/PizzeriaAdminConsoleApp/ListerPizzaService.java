package fr.pizzeria.console.PizzeriaAdminConsoleApp;

import java.util.Scanner;

import fr.pizzeria.model.pizza.Pizza;
import fr.pizzeria.model.pizza.PizzaDao;

public class ListerPizzaService extends MenuService{

	@Override
	public void executeUC(Scanner scanner,PizzaDao lesPizzas) {
		
		System.out.println("1. Liste des pizzas ");
		for(Pizza pizza: lesPizzas.findAllPizzas()){
			System.out.println(pizza);
		}
		
	}

}
