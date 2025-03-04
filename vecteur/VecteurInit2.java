package vecteur;

import java.util.Iterator;
import java.util.Scanner;

public class VecteurInit2 {

	public static void main(String[] args) {
		int[] tableau = new int[20];
		int nombre = 0;
		String ligne = "";
		for (int i = 0; i < tableau.length; i++) {
			tableau[i] = nombre;
			ligne += tableau[i] + " ";

			if ((i + 1) % 5 == 0) {
				System.out.println(ligne);
				ligne = "";
			}

			nombre += 2;

		}

	}

}
