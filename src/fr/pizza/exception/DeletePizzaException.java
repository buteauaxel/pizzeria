package fr.pizza.exception;

public class DeletePizzaException extends PizzaException{
	
	/** Génère un message d'erreur lors de la suppression d'une pizza
	 * serialVersionUID : long
	 * 
	 */
	private static final long serialVersionUID = -2757634710333055641L;

	/** Constructor
	 * @param msg
	 */
	public DeletePizzaException(String msg) { 
		super(msg);
		// TODO Auto-generated constructor stub
	}

	
}
