package decouverte;

import java.util.Scanner;

public class LesSaisies {

	public static void main(String[] args) {
		
		String prénom;
		int âge;
		double montant;
		char lettrePréférée;
		boolean enForme;
		System.out.println("Bonjour, entre ton prénom");
		prénom=new Scanner(System.in).nextLine();
		 System.out.println(prénom+", entre ton âge stp");
	        âge= new Scanner(System.in).nextInt();
	        // nextShort(), nextByte(), nextLong()
	        System.out.println("entrez le montant de votre compte en banque");
	        montant= new Scanner(System.in).nextDouble();
	        ///////////////ATTENTION saisie avec ,
	        System.out.println("es tu en forme ?");
	        enForme= new Scanner(System.in).nextBoolean(); 
	         // true ou false en minuscules
	        System.out.println("quelle est ta lettre préférée ?");
	        lettrePréférée= new Scanner(System.in).nextLine().charAt(0);
	        //----------------------------------saisie String.on prend le premier caractère
	        System.out.println("quelle est ta lettre minuscule préférée?");
	        lettrePréférée= new Scanner(System.in).nextLine().toLowerCase().charAt(0);
	        
	        System.out.println("en bref, tu t'appelles "+prénom +", tu as "+âge+" ans et ta lettre préférée est "+
	                            lettrePréférée);
	}

}
