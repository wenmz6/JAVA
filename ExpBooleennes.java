package assignation;

import java.util.Scanner;

public class ExpBooleennes {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		// Exercice 1: le nombre est compris entre 5 et 10
		
		int nb1;
		System.out.println("Entrer un nombre");
		nb1= new Scanner(System.in).nextInt();
		
		if (nb1>=5 && nb1<=10) {
			System.out.println("Correct");
			
		}
		else System.out.println("faux");
		
		// Exercice 2: le nombre est compris entre 5 et 99 mais different de 10
		System.out.println("Entrer un nombre");
		nb1= new Scanner(System.in).nextInt();
		
		if ((nb1>=5 && nb1<=99) & nb1!=10) {
			System.out.println("Correct");
		}
		else System.out.println("faux");
			
		
		// Exercice 3: le nombre n'est pas compris entre 6 et 85
		System.out.println("Entrer un nombre");
		nb1= new Scanner(System.in).nextInt();
		
		if (nb1<=6 && nb1>=85) {
			System.out.println("correct");
		}
		else System.out.println("faux");
		// Exercice 4: le nombre est compris entre 1 et 18 ou entre 65 et 90
		System.out.println("Entrer un nombre");
		nb1= new Scanner(System.in).nextInt();
		
		if ((nb1>=1 && nb1<=18) |(nb1>=65 &&nb1<=90)) {
			System.out.println("correct");
		}
		else System.out.println("faux");
		// Exercice 5: le nombre est une année bissextile
		
		
			
			
	}
}
