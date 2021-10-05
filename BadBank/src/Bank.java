public class Bank {

    int solde;
    int decouvert;

    Bank(int solde, int decouvert){
        this.solde = solde;
        this.decouvert = decouvert;
    }

    public void action(int action, int somme) {
        if(action ==1) {
            solde = solde + somme;
        }

        if (action ==2) {
            if(somme <= (solde + decouvert)) {
                solde = solde - somme;
            }else {
                System.out.println("Action refusée. ");
            }
        }

        if(action ==3) {
            System.out.println("Le solde est de : " + solde);
        }
    }
}