
public class Lotto {

	public static void main(String[] args) {
		int[] tableau = new int[6];
		Random random = new Random();
		
		System.out.println("Tirage lotto: ");
		for (int i=0; i < tableau.length; i++) {
			tableau[i] = random.nextInt(46);// 0?
			System.out.print(tableau[i] + " ");
			//les chiffres ne doivent pas se repeter 

		}
	}

}
