package assignation;

import java.util.Scanner;

public class Permutation3Varables {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
	
		System.out.println("Entrez 3  nombres");
		int a= new Scanner(System.in).nextInt();
		int b= new Scanner(System.in).nextInt();
		int c= new Scanner(System.in).nextInt();
		
		int x=a;
		

	x = b;
        b = c;
        c = a;     
        a = x;

	
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		
	}

}
