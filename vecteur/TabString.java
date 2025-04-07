public class TabString {

	public static void main(String[] args) {
		String tableau[] = { "z�ro", "un", "deux", "trois", "quatre", "cinq", "six", "sept", "huit", "neuf" };

		int chiffre = 0;

		for (int i = 0; i < tableau.length; i++) {
			chiffre = new Scanner(System.in).nextInt();
			if (chiffre >= 0 && chiffre <= 9) {
				i = chiffre;
				System.out.println(chiffre + "->" + tableau[i]);

			} else
				System.out.println("Votre chiffre n'est pas compris entre 0 et 9");
		}

	}

}

//do{
//    System.out.println("Entrez un chiffre  compris entre 0 et 9 ou -1 si vous voulez arr�ter");
//    chiffre = new Scanner(System.in).nextInt();
//    if(chiffre>=0&&chiffre<tableau.length) System.out.println(chiffre + "->" + tableau[chiffre]); 
//                          // pas besoin de boucler z�ro correspond � l'indice 0, un � l'indice 1,... 
//  }while(chiffre !=-1);
