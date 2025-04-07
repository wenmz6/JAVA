import java.util.Random;
import java.util.Scanner;

public class Pendu3 {

	public static boolean motATrouve(char[] motSaisi, String motATrouve) {
		String stringMotSaisi = new String(motSaisi);

		boolean gagner = stringMotSaisi.equals(motATrouve);

		return gagner;
	}

	public static void Afficher(char[] mot) {

		String motCache = "";

		for (int i = 0; i < mot.length; i++) {
			if (mot[i] == 0) {
				motCache += "_ ";

			} else {
				motCache += mot[i];
			}
		}

		System.out.println("Mot a trouver: " + motCache);
	}

	public static void AffihcerPotence() {
		System.out.println("__________________");
		System.out.println("|          |");
		System.out.println("|        ");
		System.out.println("|         ");
		System.out.println("|         ");
		System.out.println("|         ");
		System.out.println("|         ");
		System.out.println("|         ");
		System.out.println("|");
	}

	public static void AfficherPendu(int nbErr) {
		System.out.println("__________________");
		System.out.println("|          |");
		System.out.println("|        " + (nbErr > 0 ? "(^_^)" : ""));
		System.out.println("|         " + (nbErr > 1 ? " | " : ""));
		System.out.println("|         " + (nbErr > 2 ? "~| " : ""));
		System.out.println("|         " + (nbErr > 3 ? " |~" : ""));
		System.out.println("|         " + (nbErr > 4 ? " | " : ""));
		System.out.println("|        " + (nbErr > 5 ?"_@_@_ " : ""));
		System.out.println("|");
	}

	public static void JouerPendu(String mot) {
		char[] motsCaracteres = mot.toCharArray();

		int erreurs = 0;

		char[] motTrouve = new char[motsCaracteres.length];

		Scanner scanner = new Scanner(System.in);
		boolean gagner = false;

		AffihcerPotence();
		
		while (6 > erreurs && !gagner) {
			Afficher(motTrouve);


			System.out.println("Introduire lettre");
			char lettreSaisie = scanner.nextLine().charAt(0);
			Boolean charTrouve = false;

			for (int i = 0; i < motsCaracteres.length; i++) {

				if (motsCaracteres[i] == lettreSaisie) {

					motTrouve[i] = lettreSaisie;

					charTrouve = true;

				}

			}

			gagner = motATrouve(motTrouve, mot);

			if (!charTrouve) {
				erreurs++;
				System.out.println("Reste " + (6 - erreurs) + " tentatives");
			}

			AfficherPendu(erreurs);

		}

		if (gagner) {
			System.out.println("( ^ u ^ ) ---- Youpie ---- ( ^ u ^ )");
		}
		else System.out.println("(X _ X) ---- Je suis mort ---- (X _ X)");
		System.out.println();
	}

	public static void main(String[] args) {
		String mots[] = { "chat", "chien", "lapin" };

		Random random = new Random();
		Scanner scanner = new Scanner(System.in);

		boolean continuer = true;

		while (continuer) {

			String motHasard = mots[random.nextInt(mots.length)];

			JouerPendu(motHasard);

			System.out.println("Rejouer ? Oui/Non");
			String reponse = scanner.nextLine().toLowerCase();

			continuer = reponse.equals("oui");

		}

	}

}
