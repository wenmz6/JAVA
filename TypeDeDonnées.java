package decouverte;

public class TypeDeDonn�es {

	public static void main(String[] args) {
		//type de donn�es primaires
		//4 types de donn�es enti�res tjs sign�es
	
		byte nb1; //1 octet de -128 � 127
		short nb2; //2 octets de -32768 � 32767
		int nb3; //4 octets de +- 2 milliards
		long nb4; // 8 octets de +-9.10exp18 (trillions)
		
		//2 types de nombres � virgule:
		
		float nb5; //6 � 7 d�cimales significatives (4 octets)3*10exp38
		double nb6; // 15 chiffres significatifs (8 octets) 1.4*10exp308
		nb6=8.236; // point pas virgule (mais � la saisie une virgule)
		
		// 2 types caract�res
		char lettre; // 1 et 1 seul caract�re
		//lettre='m'; pas quote et quote il faut un carac�re dedans ou un espace dedans
		
		// le type bool�en
		boolean ok;
		ok=true;
		ok=false;
		ok=!ok;
		// si ok es true alors ok false sinon ok false fin de si 
		////////////
		//une infinit� de type donn�es classes
		///////////
		String phrase="il fait nuageux";// des guillemets et non des quotes
		System.out.println(phrase.toUpperCase());//pour mettre tout en maj
		
	}

}
