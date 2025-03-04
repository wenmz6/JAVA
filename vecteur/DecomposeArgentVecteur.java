package vecteur;

import java.util.Scanner;

public class DecomposeArgentVecteur {

	public static void main(String[] args) {

		int reste = 0;

		int tableau[] = { 500, 200, 100, 50, 20, 10, 5, 2, 1 };
		System.out.println("Entrez montant: ");
		int somme = new Scanner(System.in).nextInt();

		for (int i = 0; i < tableau.length; i++) {
			reste = somme % tableau[i];
			if (i < tableau.length - 2) {
				System.out.println("Billet(s) de " + tableau[i] + " :" + (somme - reste) / tableau[i]);
				somme = reste;
			} else
				System.out.println("Pièce(s) de " + tableau[i] + " :" + (somme - reste) / tableau[i]);
			somme = reste;
		}

	}
}
