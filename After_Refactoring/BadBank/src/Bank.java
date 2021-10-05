public class Bank {
    int solde;
    int decouvert;

    Bank(int solde, int decouvert) {
        this.solde = solde;
        this.decouvert = decouvert;
    }

    public void depot(int somme) {
        solde = solde + somme;
    }

    public void retrait(int somme) {
        if (somme <= (solde + decouvert)) {
            solde = solde - somme;
        } else {
            System.out.println("Action refusée.");
        }
    }

    public void affichage() {
        System.out.println("Le solde est de : " + solde);
    }
}