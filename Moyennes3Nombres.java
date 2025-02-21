package assignation;

import java.util.Scanner;

public class Moyennes3Nombres {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
	int nb1,nb2,nb3;
	double moyenne;
	
	System.out.println("Entrer les 3 nombres");
	nb1= new Scanner(System.in).nextInt();
	nb2= new Scanner(System.in).nextInt();
	nb3= new Scanner(System.in).nextInt();
	
	System.out.println("Moyenne des 3 nombres est égale à "+((nb1+nb2+nb3)/3));
	

	}

}
