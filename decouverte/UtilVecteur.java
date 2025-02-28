package découverte;

import java.util.Random;

public class UtilVecteur {
	public static void affiche(int[] vecteur) {
		for(int i=0;i<vecteur.length;i++) {  //t2.length nb de cases
			System.out.print( vecteur[i]+ " ");
		}
		System.out.println();
	}
	public static void affiche(String[] vecteur) { 
		// overloading ou surcharge de méthode
		for(int i=0;i<vecteur.length;i++) {  //t2.length nb de cases
			System.out.print( vecteur[i]+ " ");
		}
		System.out.println();
	}
	public static void affiche(boolean[] vecteur) {
		for(int i=0;i<vecteur.length;i++) {  //t2.length nb de cases
			System.out.print( vecteur[i]+ " ");
		}
		System.out.println();
	}
	public static void affiche(double[] vecteur) {
		for(int i=0;i<vecteur.length;i++) {  //t2.length nb de cases
			System.out.print( vecteur[i]+ " ");
		}
		System.out.println();
	}
	public static void affiche(char[] vecteur) {
		for(int i=0;i<vecteur.length;i++) {  //t2.length nb de cases
			System.out.print( vecteur[i]+ " ");
		}
		System.out.println();
	}
	public static void initVecteur(int[] vecteur,int nb) {
		for(int i=0;i<vecteur.length;i++) {  //t2.length nb de cases
			vecteur[i]=nb;
		}
	
	}
	public static void initVecteurAléatoire(int[] vecteur) {
		Random r= new Random();
		for(int i=0;i<vecteur.length;i++) {  //t2.length nb de cases
			vecteur[i]=r.nextInt(50); // nb aléatoire compris entre 0 et 49
		}
	
	}

}
