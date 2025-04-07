public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int borneInferieure = scanner.nextInt();
        int borneSuperieure = scanner.nextInt();
        int somme = 0;

        while (borneInferieure <= borneSuperieure) {
            somme += borneInferieure;
            borneInferieure++;
        }
        System.out.println("La somme est de: " + somme);

    }

}
