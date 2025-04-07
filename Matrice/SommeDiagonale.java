import java.util.Random;
import java.util.Scanner;

public class SommeDiagonale {
	public static void afficheTableau(int[] tableau) {
		System.out.println("Somme: ");
		for (int i = 0; i < tableau.length; i++) {
			System.out.print(tableau[i] + "\t");
		}
	}

	public static void main(String[] args) {
		int[][] tableau = new int[4][4];
		int somme = 0;
		int somme2 = 0;
		Random random = new Random();

		for (int i = 0; i < tableau.length; i++) {
			for (int j = 0; j < tableau[i].length; j++) {
				tableau[i][j] = random.nextInt(100);

			}
		}

		for (int i = 0; i < tableau.length; i++) {
			for (int j = 0; j < tableau[i].length; j++) {
				System.out.print(tableau[i][j] + "\t");
			}
			System.out.println();
		}
		for (int i = 0; i < tableau.length; i++) {
			for (int j = 0; j < tableau[0].length; j++) {
				if (i == j) {
					somme = somme + tableau[i][j];
				}
			}

		}
		System.out.println("Somme premi�re diagonale: " + somme);
		
		for (int i = 0; i < tableau.length; i++) {
			for (int j = 0; j < tableau[0].length; j++)  {
				if (i + j == tableau.length - 1) {
					somme2 = somme2 + tableau[i][j];
				}
			}

		}
		System.out.println("Somme deuxi�me diagonale: " + somme2);
	}
}
