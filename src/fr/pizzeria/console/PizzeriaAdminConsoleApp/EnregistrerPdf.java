
package fr.pizzeria.console.PizzeriaAdminConsoleApp;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import fr.pizzeria.model.pizza.Pizza;
import fr.pizzeria.model.pizza.PizzaDao;
import fr.pizzeria.utils.PDFGenerator;

/**
 * @author Axel B.
 *
 */
public class EnregistrerPdf extends MenuService {
	
	public void executeUC(Scanner scanner,PizzaDao lesPizzas) {

		List<Pizza> pizza= new ArrayList<Pizza>();
		pizza = lesPizzas.findAllPizzas();
		PDFGenerator.PDFGenerator(pizza); /** Création d'un PDF en appelant PDFGenerator , regroupant la liste des pizzas*/
		
	}
	

}
