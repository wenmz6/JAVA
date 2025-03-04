package vecteur;

import java.util.Scanner;

public class Inverse {

	public static void main(String[] args) {
		int[] tableau = new int[11];
	

		for (int i = 0; i < tableau.length; i++) {
			tableau[i] = new Scanner(System.in).nextInt();
		}
		for (int i = 0;i < tableau.length ; i++) {
			System.out.print(tableau[i]+ " ");
		}
		System.out.println("\n");
		for (int i = 0; i < tableau.length-i; i++) {
			int temp = tableau[i];
			tableau[i] = tableau[tableau.length -1- i];
			tableau[tableau.length -1- i] = temp;
		}
		for (int i = 0; i < tableau.length; i++) {
			System.out.print(tableau[i]+" ");
		}
	}
}