package découverte;

import java.util.Random;

public class VecteurPremiereCouche {

	public static void main(String[] args) {
		int[] t1= new int[10];
		int t2[];
		int t3[]= {1,2,3,4,5,6,7,8,9};
		String t4[]= {"soleil","nuage","neige","giboulées"};
		char[] t5= {'e','r','t','g'};
		t2= new int[50];
		System.out.println(t1); // adresse
		for(int i=0;i<10;i++) {
			t1[i]=56;
		}
		for(int i=0;i<=9;i++) {
			System.out.print( t1[i]+ " ");
		}
		System.out.println();
		for(int i=0;i<t2.length;i++) {  //t2.length nb de cases
			System.out.print( t2[i]+ " ");
		}
		System.out.println();
		UtilVecteur.initVecteurAléatoire(t2);
		UtilVecteur.affiche(t2);
		UtilVecteur.affiche(t4);
		UtilVecteur.affiche(t5);
	}



}
