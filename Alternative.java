package decouverte;

import java.util.Scanner;

public class Alternative {

    public static void main(String[] args) {
        int âge;
        int nbPages =3;
        System.out.println("entrez votre âge");
        âge=new Scanner(System.in).nextInt();
        if(âge<0 || âge>130)
            System.out.println("mauvaise réponse");
        else
            if(âge>=18 && âge<=67)
                System.out.println("vous êtes actifs");
            else
                System.out.println("profitez de la vie");

        /// ou
        if(âge<0 || âge>130) {
            System.out.println("mauvaise réponse");
        }else {
            if(âge>=18 && âge<=67) {
                System.out.println("vous êtes actifs");
            }else {
                System.out.println("profitez de la vie");
            }
        }// fin else de if(âge<0 || âge>130)

        System.out.print("il y a "+nbPages +" page");
        if(nbPages>1)
            System.out.println("s");
        else
            System.out.println();

        System.out.println("il y a "+nbPages +" page"+(nbPages>1 ? "s" : ""));
        
        switch(nbPages) {
        case 2:
        case 1:
        case 3:
            System.out.println("un, deux ou trois pages");
            break;
        case 40:
            System.out.println("quarante pages");
            break;
        default :
            System.out.println("un certain nombre de pages");
            
        }

    }

}