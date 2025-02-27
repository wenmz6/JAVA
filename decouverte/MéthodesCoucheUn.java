package découverte;
import java.util.Scanner;
public class MéthodesCoucheUn {
	public static void aurevoir() {
		System.out.println("\n\n");
		for(int i=0;i<40;i++)
			System.out.print("*");
		System.out.println();
		System.out.println("    au revoir");
		for(int i=0;i<40;i++)
			System.out.print("*");
		System.out.println();
	}
	public static void main(String[] args) {
		int age;
		String rep;
		do {	
			bienvenue();

			System.out.println("entre ton âge stp");
			age= new Scanner(System.in).nextInt();
			if(age<=3)
				System.out.println("la valeur est trop petite");
			else
				if(age<18)
					System.out.println("encore aux études ?");
				else
					if(age<25)
						System.out.println("un petit jeune?");
					else
						if(age<35)
							System.out.println("les premiers cheveux blancs ?");
						else
							if(age<45)
								System.out.println("l'âge mur ?");
							else
								if(age<67)
									System.out.println("hors garantie?");
								else
									System.out.println("on est pensionné ?");
			do {
				System.out.println("voulez-vous recommencer ? (oui/non) ");
				rep=new Scanner(System.in).nextLine();
			}while(!rep.equalsIgnoreCase("oui") && ! rep.equalsIgnoreCase("non"));
		}while(rep.equalsIgnoreCase("oui"));

		aurevoir();
	}

	public static void bienvenue() {
		System.out.println("***************************");
		System.out.println("********Bienvenue**********");
		System.out.println("***************************");
		System.out.println("\n***************************");
		System.out.println("**   Isabelle Detrixhe   **");
		System.out.println("***************************");
		System.out.println("\nVoici le programme :");
		System.out.println("et si on parlait de votre âge ?\n");
	}


}
