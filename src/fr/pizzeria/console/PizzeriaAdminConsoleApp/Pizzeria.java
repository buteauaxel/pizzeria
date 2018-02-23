package fr.pizzeria.console.PizzeriaAdminConsoleApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


import fr.pizzeria.model.pizza.Pizza;

public class Pizzeria {

	public static void main(String[] args) {

		
		Scanner questionUser = new Scanner(System.in);
		int choix;
		
		
				
				
		do{
			
			
		
		System.out.println("***** Pizzeria Administration *****"+"\n");
		System.out.println("1. Liste des pizzas ");
		System.out.println("2. Ajouter une nouvelle pizza");
		System.out.println("3. Mettre à jour une pizza");
		System.out.println("4. Supprimer une pizza");
		System.out.println("99.Sortir ");
		choix = questionUser.nextInt();
		boolean laPizza = false;
		int j = 0;
		
		
		switch(choix) {
		
		case 1 : 
			System.out.println("1. Liste des pizzas ");
			for(int i=0 ; i < Pizza.getCompteur(); i++){
				if( lesPizzas.get(i) != null){
				System.out.println( lesPizzas.get(i).getCode() + " -> "+  lesPizzas.get(i).getLibelle() +"("+  lesPizzas.get(i).getPrix() +")");
				}
			}
			
			break;
		case 2 :
			System.out.println("2. Ajouter une nouvelle pizza "+"\n ");
			
			System.out.println("Veuillez saisir le code :"+"\n");
			String code = questionUser.next();
			System.out.println("Veuillez saisir le nom (sans espace) :"+"\n");
			String nom = questionUser.next();
			System.out.println("Veuillez saisir le prix :"+"\n");
			double prix = questionUser.nextInt();
			
			lesPizzas.add(new Pizza(code, nom, prix ));
			
			break;	
		case 3 :
			System.out.println("3. Mettre à jour une pizza"+"\n");
			System.out.println("Veuillez choisir le code de la pizza à modifier :"+"\n"+"\n");
			
			String codeP = questionUser.next();
			
			do{
				
				if(codeP.equals( lesPizzas.get(j).getCode())) {
					System.out.println("Veuillez choisir le nouveau code  :"+"\n");
					 lesPizzas.get(j).setCode(questionUser.next());
					System.out.println("Veuillez choisir le nouveau nom ( sans espace ) :"+"\n");
					 lesPizzas.get(j).setLibelle(questionUser.next());
					System.out.println("Veuillez choisir le nouveau prix :"+"\n");
					 lesPizzas.get(j).setPrix(questionUser.nextDouble());
					laPizza = true;
					
				} j++;
				
			} while (laPizza == false);
							
			break;
			
		case 4 :
			System.out.println("Veuillez choisir la pizza à supprimer  :"+"\n");
			for(int i=0 ; i < Pizza.getCompteur(); i++){
				if(  lesPizzas.get(i) != null){
				System.out.println( lesPizzas.get(i).getCode() + " -> "+  lesPizzas.get(i).getLibelle() +"("+  lesPizzas.get(i).getPrix() +")");
				}
			}
			String codeS = questionUser.next();
				
			do{
				
				if (codeS.equals( lesPizzas.get(j).getCode())){
					 lesPizzas.remove(j); 
					laPizza = true;							
				}					
			}
			while(laPizza = false);
			
			
			break;
		case 99 :	
			System.out.println("99.Au revoir ! ");
			break;		
		} 
			
		}while(choix != 99 );
		questionUser.close();
		
		
	}

}
