package boucles;

import java.util.Scanner;

public class MinMax {

	public static void main(String[] args) {
		int compteurMin = 1;
		int compteurMax = 1;
		int max = 0;
		
		System.out.println("Entrez un nombre, pour terminer tapez 0");
		Scanner scanner = new Scanner(System.in);
		int nombre = scanner.nextInt();
		int min = nombre;
		
		while (nombre != 0) {
			if (nombre > max) {
				max = nombre;
				compteurMax = 1;
			} 
			else if (nombre < min) {
				min = nombre;
				compteurMin = 1;
			}
			else if (nombre == max) {
				compteurMax++;
			}
			else if (nombre == min) {
				compteurMin++;
			}
			
			nombre = scanner.nextInt();
		}

		String texte = String.format("Min %d, %d fois. Max %d, %d fois", min, compteurMin, max, compteurMax);

		System.out.println(texte);

	}
}