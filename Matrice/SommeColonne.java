
import java.util.Random;
import java.util.Scanner;

public class SommeColonne {
	
	public static void afficheTableau(int[] tableau) {
		System.out.println("Somme: ");
		for (int i = 0; i < tableau.length; i++) {
			System.out.print(tableau[i]+"\t");
		}
	}
	
