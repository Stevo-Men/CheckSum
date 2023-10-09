import java.util.Scanner;

public class Menu {
    int userChoice;


    public void start() {
        Scanner scanner = new Scanner(System.in);

        while (userChoice != 3) {
            displayChoice();


            if (scanner.hasNextInt()) {
                userChoice = scanner.nextInt();


                if (userChoice == 1) {
                    System.out.println("Vous avez choisi l'action 1.");
                }
                if (userChoice == 2) {
                    System.out.println("Vous avez choisi l'action 2.");
                }
                if (userChoice == 3) {
                    System.out.println("Au revoir!");
                }

            } else {
                System.out.println("Entrée invalide. Veuillez entrer un numéro d'action valide.");
                scanner.next();
            }
        }

        scanner.close();
    }

    private void displayChoice() {
        System.out.println("Bienvenue dans le programme Checksum");
        System.out.println("Quelle action voulez-vous effectuer?");
        System.out.println("1. Encodage");
        System.out.println("2. Décodage");
        System.out.println("3. Quitter");
    }
}
