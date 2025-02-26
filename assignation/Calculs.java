package assignation;

import java.util.Scanner;

public class Calculs {

	public static void main(String[] args) {
		int nb1,nb2;
		System.out.println("Saisir 2 nombres");
		nb1= new Scanner(System.in).nextInt();
		nb2= new Scanner(System.in).nextInt();
		System.out.println(nb1 + "+" +  nb2 +  "=" +(nb1+nb2));
		System.out.println(nb1 + "-" +  nb2 +  "=" +(nb1-nb2));
		System.out.println(nb1 + "*" +  nb2 +  "=" +(nb1*nb2));
		
	}
}
