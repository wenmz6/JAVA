package decouverte;

import java.util.Scanner;

public class LesSaisies {

	public static void main(String[] args) {
		
		String pr�nom;
		int �ge;
		double montant;
		char lettrePr�f�r�e;
		boolean enForme;
		System.out.println("Bonjour, entre ton pr�nom");
		pr�nom=new Scanner(System.in).nextLine();
		 System.out.println(pr�nom+", entre ton �ge stp");
	        �ge= new Scanner(System.in).nextInt();
	        // nextShort(), nextByte(), nextLong()
	        System.out.println("entrez le montant de votre compte en banque");
	        montant= new Scanner(System.in).nextDouble();
	        ///////////////ATTENTION saisie avec ,
	        System.out.println("es tu en forme ?");
	        enForme= new Scanner(System.in).nextBoolean(); 
	         // true ou false en minuscules
	        System.out.println("quelle est ta lettre pr�f�r�e ?");
	        lettrePr�f�r�e= new Scanner(System.in).nextLine().charAt(0);
	        //----------------------------------saisie String.on prend le premier caract�re
	        System.out.println("quelle est ta lettre minuscule pr�f�r�e?");
	        lettrePr�f�r�e= new Scanner(System.in).nextLine().toLowerCase().charAt(0);
	        
	        System.out.println("en bref, tu t'appelles "+pr�nom +", tu as "+�ge+" ans et ta lettre pr�f�r�e est "+
	                            lettrePr�f�r�e);
	}

}
