package fr.pizzeria.model.pizza;

import java.util.*;
/** Interface mère permettant au classes filles la redéfinitions de ces methodes */
/**
 * @author Axel B.
 *
 */
public abstract interface PizzaDao {
	
	void  init();
	List <Pizza>findAllPizzas();
	void saveNewPizza(Pizza pizza);
	void updatePizza(String codePizza, Pizza pizza);
	void deletePizza(String codePizza);
	Pizza FindPizzaByCode(String codePizza);
	Boolean PizzaExists(String codePizza);

}
