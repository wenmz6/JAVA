package vecteur;

import java.util.Random;

public class VecteurAléat {

	public static void main(String[] args) {
//		Ecrire un programme qui remplit aléatoirement un vecteur de 10 éléments (nombre compris
//				entre 0 et 30) et qui l’affiche en une ligne.

		int[] tableau = new int[10];
		Random random = new Random();

		for (int i = 0; i < tableau.length; i++) {
			tableau[i] = random.nextInt(31);
			System.out.print(tableau[i] + " ");

		}

	}

}
