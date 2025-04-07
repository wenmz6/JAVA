public class Char {

	public static void main(String[] args) {
		char tableau[][] = new char[5][4];

		for (int i = 0; i < tableau.length; i++) {
			for (int j = 0; j < tableau.length; j++) {

				if (i == 0 || j == 1 || j == tableau.length-1) {
					tableau[i][j] = 'a';
					

				}
			}
		}
			for (int i = 0; i < tableau.length; i++) {
				for (int j = 0; j < tableau.length; j++) {
				System.out.print(tableau[i][j]+ "\t");
			}
				System.out.println();
			}

		

    }
}
