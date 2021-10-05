public class Bank {
    int solde;
    int decouvert;

    Bank(int solde, int decouvert) {
        this.solde = solde;
        this.decouvert = decouvert;
    }

    public void action(Action action, int somme) {
        if (action == Action.DEPOT) {
            solde = solde + somme;
        }
        if (action == Action.RETRAIT) {
            if (somme <= (solde + decouvert)) {
                solde = solde - somme;
            } else {
                System.out.println("Action refusée. ");
            }
        }
        if (action == Action.AFFICHAGE) {
            System.out.println("Le solde est de : " + solde);
        }
    }
}