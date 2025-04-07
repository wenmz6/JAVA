package matrice;

import java.util.Scanner;

public class TableauChar {

	public static void main(String[] args) {
		char tableau[][] = new char[5][4];

		for (int i = 0; i < tableau.length; i++) {
			for (int j = 0; j < tableau.length; j++) {
				

				if (i == 0 || j == 1 || j == tableau.length-1) {
					tableau[i][j] = 'a';
					

				}
			}
		}
			for (int i = 0; i < tableau .length; i++) {
				for (int j = 0; j < tableau.length; j++) {
				System.out.print(tableau[i][j]+ "\t");
			}
				System.out.println();
			}

		}


		//for (int i = 0; i < tableau.length; i++) {
			// char mot= new Scanner(System.in).nextLine().charAt(0);

	//	}

	}



//String value = "a";
//int charValue = value.charAt(0);
//String next = String.valueOf( (char) (charValue + 1));
//System.out.println(next);