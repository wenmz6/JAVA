package boucles;

import java.util.Scanner;

public class Pairs {

	public static void main(String[] args) {
		System.out.println("20 premiers nombres paires et non nuls");
		int nombre=2;
		int compteur=0;
		while(compteur<20) {
			nombre+=2;
			compteur++;
			System.out.println(compteur+". "+nombre);
		}

	}

}
