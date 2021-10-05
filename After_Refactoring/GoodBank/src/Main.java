public class Main {

    public static void main(String[] args)
    {
        Bank bank = new Bank(0, 100);

        bank.depot(50);
        bank.affichage();
        bank.retrait(100);
        bank.affichage();
    }
}