package fr.pizzeria.model.pizza;

import java.util.ArrayList;
import java.util.List;

public abstract class PizzaMemDao implements PizzaDao {
	
	public void init() {
		List <Pizza> lesPizzas = new ArrayList <Pizza>();
		
		Pizza p0 = new Pizza("PEP","Pépéroni",12.50);
			lesPizzas.add(p0) ;
		
		Pizza p1 = new Pizza("MAR","Margherita",14.00);
			 lesPizzas.add(p1);
		
		Pizza p2 = new Pizza("REIN","La Reine",11.50);
			lesPizzas.add(p2);
		
		Pizza p3 = new Pizza("FRO","La 4 fromages",12.00);
			lesPizzas.add(p3);
		
		Pizza p4 = new Pizza("CAN","La cannibale",12.50);
			lesPizzas.add(p4);
		
		Pizza p5 = new Pizza("SAV","La Savoyarge",13.00 );
			lesPizzas.add(p5);
		
		Pizza p6 = new Pizza("ORI","L'Orientale",13.50 );
			lesPizzas.add(p6);
		
		Pizza p7 = new Pizza("IND","L'Indienne",14.00);
			lesPizzas.add(p7);
		
	}

	@Override
	public List<Pizza> FindAllPizzas() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveNewPizza(Pizza pizza) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updatePizza(String codePizza, Pizza pizza) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletePizza(String codePizza) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Pizza FindPizzaByCode(String codePizza) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean PizzaExists(String codePizza) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
