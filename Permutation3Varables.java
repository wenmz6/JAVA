package assignation;

import java.util.Scanner;

public class Permutation3Varables {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int a,b,c,x,y;
		System.out.println("Entrez 3  nombres");
		a= new Scanner(System.in).nextInt();
		b= new Scanner(System.in).nextInt();
		c= new Scanner(System.in).nextInt();
		x=0;
		
		x=a;
		a=b;
		b=x;

	
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		
	}

}
