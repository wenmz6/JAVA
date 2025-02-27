package alternatives;

import java.util.Scanner;

public class Amende {

	public static void main(String[] args) {
		System.out.println("Quelle est la limitation de vitesse");
		int limitation=new Scanner(System.in).nextInt();
		System.out.println("Quelle est votre vitesse?");
		int vitesse= new Scanner(System.in).nextInt();
		int difference= vitesse-limitation;
		
		if (limitation>vitesse)
			System.out.println("pas d'exces de vitesse");
		else
			if (difference >0 && difference <=20)
				System.out.println("Amende de 50€");
			else 
				if (difference <=30)
						System.out.println("Amende de 100€");
					else
						if (difference <=50)
							System.out.println("Amende de 200€");
						else
							System.out.println("Retrait permis");
		
		
		
		
		

	}

}
