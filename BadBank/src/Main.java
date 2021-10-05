public class Main {

    public static void main(String[] args)
    {
        Bank bank = new Bank(0, 100);

        bank.action(Action.DEPOT, 50);
        bank.action(Action.AFFICHAGE, 0);
        bank.action(Action.RETRAIT, 100);
        bank.action(Action.AFFICHAGE, 0);
    }

}