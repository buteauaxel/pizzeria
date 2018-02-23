package fr.pizzeria.console.PizzeriaAdminConsoleApp;

import java.util.Scanner;

import fr.pizzeria.model.pizza.Pizza;

public class Pizzeria {

	public static void main(String[] args) {

		
		Scanner questionUser = new Scanner(System.in);
		int choix;
		
		Pizza[] lesPizzas = new Pizza[50];
		
		Pizza p0 = new Pizza("PEP","Pépéroni",12.50);
			lesPizzas[0] = p0 ;
		
		Pizza p1 = new Pizza("MAR","Margherita",14.00);
			 lesPizzas[1] = p1;
		
		Pizza p2 = new Pizza("REIN","La Reine",11.50);
			lesPizzas[2]= p2;
		
		Pizza p3 = new Pizza("FRO","La 4 fromages",12.00);
			 lesPizzas[3] = p3 ;
		
		Pizza p4 = new Pizza("CAN","La cannibale",12.50);
			lesPizzas[4] = p4 ;
		
		Pizza p5 = new Pizza("SAV","La Savoyarge",13.00 );
			lesPizzas[5] = p5 ;
		
		Pizza p6 = new Pizza("ORI","L'Orientale",13.50 );
			 lesPizzas[6] = p6 ;
		
		Pizza p7 = new Pizza("IND","L'Indienne",14.00);
			 lesPizzas[7] = p7;
				
				
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
				if( lesPizzas[i] != null){
				System.out.println(lesPizzas[i].getCode() + " -> "+ lesPizzas[i].getLibelle() +"("+ lesPizzas[i].getPrix() +")");
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
			
			lesPizzas[Pizza.getCompteur()] = new Pizza(code, nom, prix );
			
			break;	
		case 3 :
			System.out.println("3. Mettre à jour une pizza"+"\n");
			System.out.println("Veuillez choisir le code de la pizza à modifier :"+"\n"+"\n");
			
			String codeP = questionUser.next();
			
			do{
				
				if(codeP.equals(lesPizzas[j].getCode())) {
					System.out.println("Veuillez choisir le nouveau code  :"+"\n");
					lesPizzas[j].setCode(questionUser.next());
					System.out.println("Veuillez choisir le nouveau nom ( sans espace ) :"+"\n");
					lesPizzas[j].setLibelle(questionUser.next());
					System.out.println("Veuillez choisir le nouveau prix :"+"\n");
					lesPizzas[j].setPrix(questionUser.nextDouble());
					laPizza = true;
					
				} j++;
				
			} while (laPizza == false);
							
			break;
			
		case 4 :
			System.out.println("Veuillez choisir la pizza à supprimer  :"+"\n");
			for(int i=0 ; i < Pizza.getCompteur(); i++){
				if( lesPizzas[i] != null){
				System.out.println(lesPizzas[i].getCode() + " -> "+ lesPizzas[i].getLibelle() +"("+ lesPizzas[i].getPrix() +")");
				}
			}
			String codeS = questionUser.next();
				
			do{
				
				if (codeS.equals(lesPizzas[j].getCode())){
					lesPizzas[j] = null; 
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
