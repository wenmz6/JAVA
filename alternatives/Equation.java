package alternatives;

import java.util.Scanner;

public class Equation {

    public static void main(String[] args) {
        // Ecrire le programme qui permet de r�soudre une �quation du premier degr� (ax+b=0)
        int a, b;
        a = new Scanner(System.in).nextInt();
        b = new Scanner(System.in).nextInt();

        if ((a == 0) & (b == 0)) {
            System.out.println("Toutes les valeurs sont possibles");
        } else {
            if ((a == 0) & (b != 0)) {
                System.out.println(" impossible");
            } else {
                System.out.println("x= " + (-b / a));
            }


        }

    }
}


