package vecteur;

import java.util.Scanner;

public class UnSurDeux {

	public static void main(String[] args) {
//		Le programme affiche le contenu d’un tableau de 20 éléments initialisé avec des nombres
//		entiers entrés par l’utilisateur et affiche ensuite les éléments dont la position dans le tableau est
//		paire.
		int[] tableau = new int[8];
		System.out.println("Introduire chiffre");
		for (int i = 0; i < tableau.length; i++) {
			tableau[i] = new Scanner(System.in).nextInt();

		}

		for (int i = 0; i < tableau.length; i += 2) {
			System.out.println(tableau[i]);

		}
	}
}
