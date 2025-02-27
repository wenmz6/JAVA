package alternatives;

import java.util.Scanner;

public class CompareDix {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int a,b;
		System.out.println("Saisir nombre");
		a= new Scanner(System.in).nextInt();
		System.out.println("Saisir nombre");
		b= new Scanner(System.in).nextInt();
		
		if ((a>10 || a==10) && (b>10 || b==10)) {
			System.out.println(a+"+"+b+"="+(a+b));
		
		}
		if (a<10 && b<10) {
			System.out.println(a+"*"+b+"="+(a*b));
	}
		if ((a>10 ||a==10)||(b>10||b==10)) {
			
			
			
			System.out.println(a+"-"+b+"="+(a-b));
			
			
		}
		
	}
}
