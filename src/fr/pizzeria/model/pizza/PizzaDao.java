package fr.pizzeria.model.pizza;

import java.util.*;

public abstract interface PizzaDao {
	
	void  init();
	List <Pizza>findAllPizzas();
	void saveNewPizza(Pizza pizza);
	void updatePizza(String codePizza, Pizza pizza);
	void deletePizza(String codePizza);
	Pizza FindPizzaByCode(String codePizza);
	Boolean PizzaExists(String codePizza);

}
