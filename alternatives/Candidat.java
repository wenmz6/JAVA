package alternatives;

import java.util.Scanner;

public class Candidat {

	public static void main(String[] args) {
		//Ecrire le programme qui demande à l’utilisateur son prénom et son âge.
		//En fonction de l’âge et du prénom, le programme affiche :
		//Si le prénom est Isabelle , « pas sélectionnée »
		//Pour les âges inférieurs à 20 et supérieurs à 50, « vous n’êtes pas concerné »
		//Si l’âge est compris entre 20 et 30 mais ni 25 ni 26, « formation A »
		//Si l’âge est compris entre 31 et 50 mais pas entre 40 et 47, « Formation B »
		//pour tous les autres, « Formation C »
		
		String prénom,isa="isabelle";
		int âge;
		System.out.println(" Saississez le prénom puis l'âge");
		prénom= new Scanner(System.in).nextLine();
		âge= new Scanner(System.in).nextInt();
	
		
		if (prénom.equals(isa))
			System.out.println("pas sélectionnée"+prénom.equals(isa));
		
		else 
			if ((âge<=20) ^ (âge>=50)) 
		
			System.out.println("Vous n'êtes pas concerné");
		
			else 
				if ((âge>=20) && (âge<=30)&& (âge!=25) && (âge!=26)) 
			System.out.println("Formation A");
		
				else 
					if ((âge>=31) && (âge<=50)&& (!(âge>=40) && (âge<=47))) 
			System.out.println("Formation B");
		
					
					else 
			System.out.println("Formation C");
			
			
	}
}
