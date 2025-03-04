package vecteur;

import java.util.Scanner;

public class DoubleNombre {

	public static void main(String[] args) {
		int[] tableau = new int[11];
		String ligne = "";
		String ligneDouble = "";

		for (int i = 1; i < tableau.length; i++) {
			tableau[i] = new Scanner(System.in).nextInt();
		}

		for (int i = 1; i < tableau.length; i++) {
			ligne += tableau[i] + " ";
			ligneDouble += tableau[i]*2 + " ";

		}
		
		System.out.println("Tableau : " + ligne);
		System.out.println("Tableau doublé: " + ligneDouble);
	}
}
