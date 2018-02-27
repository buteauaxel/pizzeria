package fr.pizzeria.console.PizzeriaAdminConsoleApp;
import java.util.*;

import fr.pizza.exception.PizzaException;
import fr.pizzeria.model.pizza.PizzaDao;

public abstract class MenuService {
	public  abstract void executeUC(Scanner scanner,PizzaDao pizzaDao) throws PizzaException;
	

	

}
