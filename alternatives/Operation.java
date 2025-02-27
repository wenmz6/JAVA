package alternatives;

import java.util.Scanner;

public class Operation {

	public static void main(String[] args) {
		System.out.println("Choississez un opérateurs.");
		System.out.println("1:addition,2.soustraction,3.multiplication,4.division");
		int choix= new Scanner(System.in).nextInt();
		System.out.println("saisir nombre");
		double a=new Scanner(System.in).nextDouble();
		System.out.println("saisir nombre");
		double b=new Scanner(System.in).nextDouble();
		
		switch (choix)
		{
		case 1: System.out.println(a+"+"+b+"= "+(a+b));
				break;
		case 2: System.out.println(a+"-"+b+"= "+(a-b));
				break;
		case 3: System.out.println(a+"*"+b+"= "+(a*b));
				break;
		case 4: if (b==0)
				System.out.println("interdiction de diviser par 0");
				else
					System.out.println(a+"/"+b+"= "+(a/b));	
					
				break;
		default: System.out.println("Veuillez sélectionner un opérateur en choissant: 1,2,3 ou 4");
		}
		

	}

}
