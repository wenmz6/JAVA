package matrice;

import java.util.Random;
import java.util.Scanner;

public class Tableau2D {

	public static void main(String[] args) {
		int[][] tableau = new int[4][5];
		Random random = new Random();

		for (int i = 0; i < tableau.length; i++) {
			for (int j = 0; j <= tableau.length; j++) {
				tableau[i][j] = random.nextInt(11) + 10;

			}
		}
		for (int i = 0; i < tableau.length; i++) {
			for (int j = 0; j <= tableau.length; j++) {
				System.out.print(tableau[i][j] + "\t");

			}
			System.out.println();
		}
	}

}