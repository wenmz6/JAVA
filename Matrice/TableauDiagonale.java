package matrice;

import java.util.Scanner;

public class TableauDiagonale {

	public static void main(String[] args) {

		System.out.println("Entrez le nombre de votre matrice carrée: ");
		Scanner scanner = new Scanner(System.in);
		int carréTaille = scanner.nextInt();
		int[][] tableau = new int[carréTaille][carréTaille];

		for (int i = 0; i < tableau.length; i++) {
			for (int j = 0; j < tableau.length; j++) {
				tableau[i][j] = carréTaille;
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
				
				if (!(i == j || i + j == carréTaille - 1)) {
					tableau[i][j] = carréTaille;
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
