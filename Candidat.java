package alternatives;

import java.util.Scanner;

public class Candidat {

	public static void main(String[] args) {
		//Ecrire le programme qui demande � l�utilisateur son pr�nom et son �ge.
		//En fonction de l��ge et du pr�nom, le programme affiche :
		//Si le pr�nom est Isabelle , � pas s�lectionn�e �
		//Pour les �ges inf�rieurs � 20 et sup�rieurs � 50, � vous n��tes pas concern� �
		//Si l��ge est compris entre 20 et 30 mais ni 25 ni 26, � formation A �
		//Si l��ge est compris entre 31 et 50 mais pas entre 40 et 47, � Formation B �
		//pour tous les autres, � Formation C �
		
		String pr�nom,isa="isabelle";
		int �ge;
		System.out.println(" Saississez le pr�nom puis l'�ge");
		pr�nom= new Scanner(System.in).nextLine();
		�ge= new Scanner(System.in).nextInt();
	
		
		if (pr�nom.equals(isa))
			System.out.println("pas s�lectionn�e"+pr�nom.equals(isa));
		
		else 
			if ((�ge<=20) ^ (�ge>=50)) 
		
			System.out.println("Vous n'�tes pas concern�");
		
			else 
				if ((�ge>=20) && (�ge<=30)&& (�ge!=25) && (�ge!=26)) 
			System.out.println("Formation A");
		
				else 
					if ((�ge>=31) && (�ge<=50)&& (!(�ge>=40) && (�ge<=47))) 
			System.out.println("Formation B");
		
					
					else 
			System.out.println("Formation C");
			
			
	}
}
