package boucles;

import java.util.Scanner;

public class Total {

	public static void main(String[] args) {
		int somme=0;
		int nombre=0;
		System.out.println("Entrez un nombre");
		nombre= new Scanner(System.in).nextInt();
		while(nombre!=0) {
			somme=(nombre+somme);
			System.out.println("Entrez un nombre");
			nombre= new Scanner(System.in).nextInt();
			
			if (nombre==0) {
				System.out.println("Total: "+somme);
				
				
			}
		}
		

	}

}

//public class Total {

  //  public static void main(String[] args) {
    //    int somme=0;
      //  int nombre=-1;  // je l'initalise à une valeur différente de 0 pour pouvoir rentrer dans la boucle
        
        //while(nombre!=0) {
         
          //  System.out.println("Entrez un nombre");
            //nombre= new Scanner(System.in).nextInt();
            //somme=nombre+somme;
        //}
        //System.out.println("Total: "+somme);
   //}

//}
