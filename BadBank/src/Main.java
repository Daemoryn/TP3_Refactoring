public class Main {

    public static void main(String args[])
    {
        Bank bank = new Bank(0, 100);

        bank.action(1, 50);
        bank.action(3, 0);
        bank.action(2, 100);
        bank.action(3, 0);
    }

}