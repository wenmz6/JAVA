package alternatives;

import java.util.Scanner;

public class DecomposeArgent {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int somme;
		int reste;
		System.out.println("Introduisez somme");
		somme= new Scanner(System.in).nextInt();
		
		if (somme>=500) {
			reste=(somme%500);
			System.out.println("Billet 500 = "+((somme-reste)/500));
			somme=reste;
		}
		
		if (somme>=200) {
			reste=(somme%200);
			System.out.println("Billet 200 = "+((somme-reste)/200));
			somme=reste;
	}
		if (somme>=100) {
			reste=(somme%100);
			System.out.println("Billet 100 = "+((somme-reste)/100));
			somme=reste;
	}
		if (somme>=50) {
			reste=(somme%50);
			System.out.println("Billet 50 = "+((somme-reste)/50));
			somme=reste;
	}
		if (somme>=10) {
			reste=(somme%10);
			System.out.println("Billet 10 = "+((somme-reste)/10));
			somme=reste;
	}
		if (somme>=5) {
			reste=(5);
			System.out.println("Billet 5 = "+((somme-reste)/5));
			somme=reste;
	}
		if (somme>=2) {
			reste=(somme%2);
			System.out.println("Pièce 2 = "+((somme-reste)/2));
			somme=reste;
	}
		if (somme>=1) {
			reste=(somme%1);
			System.out.println("Pièce 1 = "+((somme-reste)/1));
			somme=reste;
	}
	}
}
