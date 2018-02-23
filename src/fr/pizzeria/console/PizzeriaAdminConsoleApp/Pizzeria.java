package fr.pizzeria.console.PizzeriaAdminConsoleApp;

import java.util.Scanner;

public class Pizzeria {

	public static void main(String[] args) {

		
		Scanner questionUser = new Scanner(System.in);
		int choix;
		do{
			
		
		System.out.println("***** Pizzeria Administration *****");
		System.out.println("1. Liste des pizzas ");
		System.out.println("2. Ajouter une nouvelle pizza");
		System.out.println("3. Mettre à jour une pizza");
		System.out.println("99.Sortir ");
		choix = questionUser.nextInt();
		
		switch(choix) {
		
		case 1 : 
			System.out.println("1. Liste des pizzas ");
			break;
		case 2 :
			System.out.println("2. Ajouter une nouvelle pizza");
			break;	
		case 3 :
			System.out.println("3. Mettre à jour une pizza");
			break;	
		case 99 :	
			System.out.println("99.Sortir ");
			break;
			
		} 
		
		

			
		}while(choix != 99 );
		questionUser.close();
	}

}
