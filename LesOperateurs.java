package decouverte;

public class LesOperateurs {

	public static void main(String[] args) {
		String s1="soleil",s2="nuage";
		int nb1,nb2,nb3;
		nb1=12;
		nb2=13;
		nb3=3;
		//op�rateurs math�matiques
		System.out.println("somme de nb1 et nb2:"		+(nb1+nb2));
		System.out.println("diff�rence de nb1 et nb2:"	+(nb1-nb2));
		System.out.println("produit de nb1 et nb2:"		+(nb1*nb2));
		System.out.println("division de nb1 et nb2:"	+((double)nb1/nb2));
		// pour transtyper (cast) la variable, pour la rendre temporairement d'un autre type
		System.out.println("la moyenne des 3 nombres:"+(nb1+nb2+nb3)/3.0);
		// le .0 indique que ce sera un type double
		
		// le modulo
		System.out.println("reste de la division enti�re : " + (nb2%nb1));
		
		//les puissances
		// pour 2exposants3
		System.out.println(Math.pow(2,3));
		// pour la racine carr�e Math.pow(2,0.5) le 0.5 est la racine carr�e ou faire Math.sqrt
		// op�rateur d'assignation

		nb1 = nb2  ;

		nb1 = nb1+23;
		nb1+=23; // idem nb1 = nb1+23;

		nb1 = nb1-23;
		nb1-=23; // idem nb1 = nb1-23;

		nb1 = nb1*23;
		nb1*=23; // idem nb1 = nb1*23;

		nb1 = nb1/23;
		nb1/=23; // idem nb1 = nb1/23;

		nb1 = nb1+1;
		nb1+=1; // idem nb1 = nb1+1;
		nb1++;  // idem nb1 = nb1+1;

		nb1 = nb1-1;
		nb1-=1; // idem nb1 = nb1-1;
		nb1--;  // idem nb1 = nb1-1;

		// op�rateurs de comparaison

		System.out.println("nb1=25? "+ (nb1==25)); // ATTENTION ==
		System.out.println("nb1<>25? "+ (nb1!=25));  // ATTENTION !=
		System.out.println("nb1<25? "+ (nb1<25));
		System.out.println("nb1<=25? "+ (nb1<=25));
		System.out.println("nb1>25? "+ (nb1>25));
		System.out.println("nb1>=25? "+ (nb1>=25));

		// A T T E N T I O N
		System.out.println("s1 = s2 ?"+ s1.equals(s2));
		System.out.println("s1 <> s2 ?"+ ! s1.equals(s2));
		s1="lapin";
		s2="LaPiN";
		System.out.println("s1 = s2 ?"+ s1.equals(s2));
		System.out.println("s1 = s2 ?"+ s1.equalsIgnoreCase(s2));
		System.out.println("s1 = 'lapin' ?"+ s1.equalsIgnoreCase("LAPIN"));

		// op�rateurs bool�ens

		System.out.println("nb1>0 et nb1<10"+ (nb1>0 & nb1<10)); // �valuation longue
		System.out.println("nb1>0 et nb1<10"+ (nb1>0 && nb1<10)); // �valuation courte

		System.out.println("nb1>0 ou nb1<10"+ (nb1>0 | nb1<10)); // �valuation longue
		System.out.println("nb1>0 ou nb1<10"+ (nb1>0 || nb1<10)); // �valuation courte

		System.out.println("nb1>0 xor nb1<10"+ (nb1>0 ^ nb1<10)); // ou exclusif
		// soit l'un soit l'autre mais pas les 2
		// renvoie si les op�randes sont contraires

		
	}

}
