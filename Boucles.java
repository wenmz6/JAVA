package decouverte;

import java.util.Scanner;

public class Boucles {

    public static void main(String[] args) {
        int cpt=0;
        int nb;
        while(cpt<=10) {
            System.out.println(cpt);
            //cpt=cpt+1;
            cpt++;
        }
        System.out.println("après ma boucle cpt="+cpt);
        do {
            System.out.println(cpt);
            //cpt=cpt-1;
            //cpt--;
            //cpt=cpt-2;
            cpt-=2;
        }while(cpt>=0);
        System.out.println("après ma boucle cpt="+cpt);
        for(int i=0; i<10;i++) {
            System.out.println("i="+i);
        }
        // System.out.println("i="+i); 
        // ko: i est déclaré dans la boucle donc utilisable dans la boucle uniquement
    
        // pour saisir un nombre pair
        do {
            System.out.println("entrez un nombre pair");
            nb= new Scanner(System.in).nextInt();
        }while(nb%2!=0);
        
        
        System.out.println("entrez un nombre pair");
        nb= new Scanner(System.in).nextInt();
        while(nb%2!=0) {
            System.out.println("entrez un nombre pair");
            nb= new Scanner(System.in).nextInt();
        }
        
        nb= 1;
        while(nb%2!=0) {
            System.out.println("entrez un nombre pair");
            nb= new Scanner(System.in).nextInt();
        }
        
        
        
        
    
    }

}
