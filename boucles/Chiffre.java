package boucles;

import java.util.Scanner;

public class Chiffre {

	public static void main(String[] args) {
		System.out.println("Entrez un chiffre");
		int chiffre= new Scanner(System.in).nextInt();
		
		while(chiffre!=0 && chiffre!=1 && chiffre!=2 && chiffre!=3) {
			System.out.println("Le chiffre doit entré doit être:0,1,2 ou 3");
			System.out.println("Entrez un chiffre");
			chiffre= new Scanner(System.in).nextInt();
		}
		System.out.println("Au revoir");
	}

}
//public class Chiffre {

  //  public static void main(String[] args) {
        
    //    int chiffre;
        
      //  do{
        //    System.out.println("entrez un chiffre, le chiffre doit entré doit être:0,1,2 ou 3");
          //  chiffre= new Scanner(System.in).nextInt();
        //}while(chiffre <0 ^ chiffre>3) ;
        //System.out.println("Au revoir");
    //}

//}
