public class Tri {

	public static void main(String[] args) {
		int[] tableau = new int[10];

		System.out.println("Introduire chiffre");

		for (int i = 0; i < tableau.length; i++) {
			tableau[i] = new Scanner(System.in).nextInt();
			
		}
		for (int i = 0; i < tableau.length; i++) {
			System.out.print(+tableau[i]+" ");
			
		}
		System.out.println();
		for (int i = 0; i < tableau.length; i++) {
			Arrays.sort(tableau);
			System.out.print(+tableau[i]+" ");
		
		}
	}
}
