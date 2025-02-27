package alternatives;

import java.util.Scanner;

public class PlusGrand {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// Écrire le programme qui lit 2 nombres entrés au clavier, 
		//qui les compare et indique lequel est le plus
		//grand ou s'ils sont égaux
		int nb1,nb2;
		System.out.println("saississez 2 nombres");
		nb1= new Scanner(System.in).nextInt();
		nb2= new Scanner(System.in).nextInt();
		
		if (nb1>nb2){
			System.out.println(nb1 +" est plus grand que "+nb2);
		}
		
		if (nb1<nb2) {
			System.out.println(nb1+" est plus petit que "+nb2);
		}
			
		if (nb1==nb2) { 
			System.out.println(nb1+" est égal à "+nb2);
		}
		

	}
}
