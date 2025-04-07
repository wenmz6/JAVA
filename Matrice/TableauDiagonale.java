package matrice;

import java.util.Scanner;

public class TableauDiagonale {

	public static void main(String[] args) {

		System.out.println("Entrez le nombre de votre matrice carr�e: ");
		Scanner scanner = new Scanner(System.in);
		int carr�Taille = scanner.nextInt();
		int[][] tableau = new int[carr�Taille][carr�Taille];

		for (int i = 0; i < tableau.length; i++) {
			for (int j = 0; j < tableau.length; j++) {
				tableau[i][j] = carr�Taille;
			}
		}
		for (int i = 0; i < tableau.length; i++) {
			for (int j = 0; j < tableau.length; j++) {
				System.out.print(tableau[i][j] + "\t");

			}
			System.out.println();
		}
		System.out.println();
		for (int i = 0; i < tableau.length; i++) {
			for (int j = 0; j < tableau.length; j++) {
				
				if (!(i == j || i + j == carr�Taille - 1)) {
					tableau[i][j] = carr�Taille;
				} else
					tableau[i][j] = 0;

			}
		}
		for (int i = 0; i < tableau.length; i++) {
			for (int j = 0; j < tableau.length; j++) {
				System.out.print(tableau[i][j] + "\t");

			}
			System.out.println();
		}

	}
}
