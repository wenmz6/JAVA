package boucles;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		System.out.println("Entrez un nombre");
		int nombre= new Scanner(System.in).nextInt();
		int multi= 0;
		
		while (multi<10) {
			multi++;
			System.out.println(nombre+"x"+multi+"= "+(nombre*multi));
			
	}
		
	}
}
