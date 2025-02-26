package boucles;

import java.util.Scanner;

public class Choix {

	public static void main(String[] args) {
		int choix1,choix2;//,i;
		System.out.println("Choississez:1.Mademoiselle,2.Madame,3.Monsieur");
		choix1= new Scanner(System.in).nextInt();
		//boolean oui=true;
		
		//for(i=3;i>=1 && i<=3;i++);
	//	while (oui)
		switch (choix1)
		{
		case 1: 
			break;
		case 2:	
			break;
		case 3:	
			break;
		default:System.out.println("Veuillez taper 1,2 ou 3");
		}
		choix2= new Scanner(System.in).nextInt();
		switch (choix2)
		{
		case 1: System.out.println(choix1+choix2);
			break;
		case 2:	
			break;
		case 3:	
			break;
		default:System.out.println("Veuillez taper 1,2 ou 3");
		
	System.out.println(choix1+choix2);
	System.out.println("Voulez vous continuer");
	//choix2= new Scanner(System.in).nextInt();
	
		}
		
	}

	}
