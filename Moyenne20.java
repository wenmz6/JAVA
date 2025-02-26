package boucles;

import java.util.Scanner;

public class Moyenne20 {

	public static void main(String[] args) {
		int nombre=0;
		int compteur=0;
		int somme=0;
		int total=0;
		
		
		
		while (compteur<20) {
			System.out.println("Entrez un nombre");
			nombre= new Scanner(System.in).nextInt();
		
			if(nombre>=10 && nombre<=20) {
				somme=(somme+nombre);
				total++;
				
			}		
		compteur++;
			
		
		}
		if (total!=0)
		System.out.println("La moyenne est de: "+(somme/total));
		else
			System.out.println("La moyenne n'est pas comprise entre 10 et 20");
	}

}
