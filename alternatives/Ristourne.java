package alternatives;

import java.util.Scanner;

public class Ristourne {

	public static void main(String[] args) {
		
		System.out.println("Quelle est le montant de vos achats?");
		double achat= new Scanner(System.in).nextDouble();
		System.out.println("Combien d'enfants avez-vous?");
		int enfant= new Scanner(System.in).nextInt();
		
		if (achat>50 && enfant>=3 || achat>100) {
			System.out.println("La ristourne est de 10%");
		}
			else
			System.out.println("La ristourne est de 5%");
		
	}

}
