package boucles;

import java.util.Scanner;

public class Choix {

	public static void main(String[] args) {
		boolean sortie = false;

		while (!sortie) {

			System.out.println("Choississez:\n1.Mademoiselle\n2.Madame\n3.Monsieur");
			Scanner scanner = new Scanner(System.in);

			int choix1 = scanner.nextInt();
			String civil = "";
			String journee = ""; // new String()

			switch (choix1) {
			case 1:
				civil = " Mademoiselle";
				break;
			case 2:
				civil = " Madame";
				break;
			case 3:
				civil = " Monsieur";
				break;

			default:
				System.out.println("Veuillez taper 1,2 ou 3");
			}

			System.out.println("Choississez:\n1.Matin\n2.Apr�s-midi\n3.Soirée");

			int choix2 = scanner.nextInt();

			switch (choix2) {
			case 1:
				journee = "Bonjour";
				break;
			case 2:
				journee = "Bon après-midi";
				break;
			case 3:
				journee = "Bonsoir";
				break;

			default:
				System.out.println("Veuillez taper 1,2 ou 3");
			}

			System.out.println(journee + civil);
			
			String reponse = "";
			
			do {
				System.out.println("Voulez vous continuer: oui/non");
				
				reponse = scanner.next().toLowerCase();
				
				sortie = !reponse.equals("oui");
			} while (!reponse.equals("oui") && !reponse.equals("non"));
			
			//  !(reponse.equals("oui") || reponse.equals("non"))
					
			System.out.println("FIN");


		}
	}
}
