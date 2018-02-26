package fr.pizzeria.model.pizza;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public  class PizzaMemDao implements PizzaDao {
	
	List <Pizza> lesPizzas = new ArrayList <Pizza>();
	
	public PizzaMemDao() {
		super();
		
	}

	public void init() {
					
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
	public List<Pizza> findAllPizzas() {
		
		return lesPizzas;
	}

	@Override
	public void saveNewPizza(Pizza pizza) {
		lesPizzas.add(pizza);
		
	}

	@Override
	public void updatePizza(String codePizza, Pizza pizza) {
		Pizza np = null;
		np = FindPizzaByCode(codePizza);
		np.setCode(pizza.getCode());
		np.setLibelle(pizza.getLibelle());
		np.setPrix(pizza.getPrix());
		
		
	}

	@Override
	public void deletePizza(String codePizza) {
		
		Iterator <Pizza> iterator = lesPizzas.iterator();
		
		while ( iterator.hasNext()){
			Pizza pa = iterator.next();
			if(pa.getCode().equals(codePizza)){
				iterator.remove();
			}
		} 
					
		
	}

	@Override
	public Pizza FindPizzaByCode(String codePizza) {
		Pizza trouver = null ;
		Iterator <Pizza> iterator = lesPizzas.iterator();
		
		while(iterator.hasNext()){
			Pizza p = iterator.next();
			if(p.getCode().equals(codePizza)){
			trouver = p; 
			}
		}
		
		return trouver;
	}

	@Override
	public Boolean PizzaExists(String codePizza) {
		boolean exist = false;
		Iterator <Pizza> iterator = lesPizzas.iterator();
		
		while(iterator.hasNext()){
			Pizza p = iterator.next();
			if(p.getCode().equals(codePizza)){
				exist = true;
			}	
	}return exist;

	

}
}

