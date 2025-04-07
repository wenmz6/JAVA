
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		System.out.println("Entrez un mot");
		String mot = new Scanner(System.in).nextLine();
		char[] motCaractere = mot.toCharArray();
		Boolean palindrome = true;
		for (int i = 0; i < motCaractere.length; i++) {
			char debut = motCaractere[i];
			char fin = motCaractere[motCaractere.length - 1 - i];
			if (fin != debut) {
				palindrome = false;
			}

		}
		if (palindrome) {

			System.out.println("C'est un palindrome");
		} else
			System.out.println("Ce n'est pas un palindrome");

	}
}
