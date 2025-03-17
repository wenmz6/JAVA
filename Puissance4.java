package labo1;

import java.util.Iterator;
import java.util.Scanner;

public class Puissance4 {

	public static void affiche(String[][] tableau) {
		for (int i = 0; i < tableau.length; i++) {
			for (int j = 0; j <= tableau.length; j++) {
				tableau[i][j] = "|_|";

			}
		}
		for (int i = 0; i < tableau.length; i++) {
			for (int j = 0; j <= tableau.length; j++) {
				System.out.print(tableau[i][j]);

			}
			System.out.println();
		}
		System.out.println();
	}

	public static void main(String[] args) {

		boolean puissance4 = false;

		String[][] tableau = new String[6][7];

		String[][] tableau2 = new String[6][7];

		int tour = 0;

		while (!puissance4 && tour < 42) {
			System.out.println("Puissance 4" + "\n");

			affiche(tableau);

			if (tour % 2 == 0) {
				System.out.println("Joueur A, veuillez jouer");
			} else if (tour % 2 == 1)
				System.out.println("Joueur B, veuillez jouer");

			System.out.println(" choississez votre colonne (1 -7 )");

			int choix = new Scanner(System.in).nextInt();

			if (choix == 1) {
				tableau2[5][0] = "[3]";

			}
			affiche(tableau2);

			tour++;

		}
		if (puissance4 == true && tour < 42 && tour % 2 == 0) {
			System.out.println(" Joueur A a gagné");
		}
		if (puissance4 == true && tour < 42 && tour % 2 == 1) {
			System.out.println("Jouer B a gagné");
		}
		if (puissance4 == false && tour > 42) {
			System.out.println("Egalité");
		}

	}

}
