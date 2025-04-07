public class Main {

    public static void print(int... args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = 0;
        int j = 1;

        int[] tableau = new int[10];

        for (int _ : tableau) {
            int nombre = new Scanner(System.in).nextInt();
            if (nombre != 0) {
                tableau[i] = nombre;
                i++;
            } else {
                tableau[tableau.length - j] = 0;
                j++;
            }
        }
        for (int element : tableau) {
            System.out.print(element+" ");

        }

    }

}
