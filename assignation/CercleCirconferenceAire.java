package assignation;

import java.util.Scanner;

public class CercleCirconferenceAire {

	public static void main(String[] args) {
		double rayon;
		double pi;
		double circonference;
		double aire;
		
		
		
		System.out.println("Entrer la valeur du rayon");
		rayon= new Scanner(System.in).nextDouble();
		
		circonference=(2*(Math.PI)*rayon);
		aire=Math.PI*(Math.pow(rayon,2));
		
		
		System.out.println("Circonférence="+ circonference);
		System.out.println("Aire="+ aire);
		
		

	}

}
