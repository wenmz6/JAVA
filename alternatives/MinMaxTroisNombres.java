package alternatives;

import java.util.Scanner;

public class MinMaxTroisNombres {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("Saississez 3 nombres");
		//int [[nombre],n1,n2,n3];
		int max,min=0;
		int n1,n2,n3;
		
		System.out.println("Entrez un nombre");
		n1= new Scanner(System.in).nextInt();
		System.out.println("Entrez un nombre");
		n2= new Scanner(System.in).nextInt();
		System.out.println("Entrez un nombre");
		n3= new Scanner(System.in).nextInt();
		
		if (n1<n2 && n1<n3) {
			min=n1;
			System.out.println("Min= 0"+min);
		}
		if (n2<n1 && n2<n3) {
			min=n2;
			System.out.println("Min= 0"+min);
			
			}
		if (n2>n3) {
			max=n2;
			System.out.println("Max="+max);
			}
		else {
			max=n3 ;
			System.out.println("Max="+max);
		}
		
			}
		
		}
	


