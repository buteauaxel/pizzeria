package fr.pizzeria.model.pizza;

import java.util.*;
/** Interface mère permettant au classes filles la redéfinitions de ces methodes */
/**
 * @author Axel B.
 *
 */
public abstract interface PizzaDao {
	
	/**
	 * 
	 */
	void  init();
	
	/** Retourne la liste des pizzas
	 * @return
	 */
	List <Pizza>findAllPizzas();
	
	/** Sauvegarde d'une pizza
	 * @param pizza
	 */
	void saveNewPizza(Pizza pizza);
	
	/** Modifie une pizza
	 * @param codePizza
	 * @param pizza
	 */
	void updatePizza(String codePizza, Pizza pizza);
	
	/**Supprime une pizza
	 * @param codePizza
	 */
	void deletePizza(String codePizza);
	
	/** Retourne une pizza par son code
	 * @param codePizza
	 * @return
	 */
	Pizza FindPizzaByCode(String codePizza);
	
	/**Retourne l'existance ou l'absence d'une pizza
	 * @param codePizza
	 * @return
	 */
	Boolean PizzaExists(String codePizza);

}
