package fr.pizzeria.console.PizzeriaAdminConsoleApp;
import java.util.*;

import fr.pizza.exception.PizzaException;
import fr.pizzeria.model.pizza.PizzaDao;

/**
 * 
 * @author Axel B.
 * Interface m�re permettant l'obligation de red�finire executeUC dans les classe filles */
 
public abstract class MenuService {
	public  abstract void executeUC(Scanner scanner,PizzaDao pizzaDao) throws PizzaException;
	

	

}
