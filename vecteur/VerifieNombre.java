public class VerifieNombre {

    public static void main(String[] args) {

        int[] tableau = new int[10];
        Scanner scanner = new Scanner(System.in); 

        System.out.println("Introduire 10 chiffres:");

     
        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = scanner.nextInt();
        }

        boolean trouve = false;

        
        while (!trouve) {
            System.out.println("V�rifiez si votre chiffre est dans la liste:");
            int nombre = scanner.nextInt();

            
            for (int i = 0; i < tableau.length; i++) {
                if (nombre == tableau[i]) {
                    System.out.println(i + " : vrai");
                    trouve = true;
                   
                }
            }

            if (!trouve) {
                System.out.println("Faux, r�essayer");
            }
        }

        scanner.close();
    }

} 
