public class Main {

    public static void main(String[] args)
    {
		/*Old Main Bank
		 * Bank bank = new Bank(0, 100);
		   bank.action(1, 50);
		   bank.action(3, 0);
	   	   bank.action(2, 100);
		   bank.action(3, 0);
		 */
		/* Old Main Person
		ArrayList<String> name = new ArrayList<>();
	      name.add("Bob");
	      name.add("Marley");
	      GoodPerson p1 = new GoodPerson(1, name);

	      System.out.println("The person code of "+p1.getFirstName()+" "+p1.getLastName()+" is "+p1.getCode()+". :)");
	      */

        GoodPerson person = new GoodPerson(Code.STUDENT, "Bob", "Marley");
        print(person);
    }

    private static void print(GoodPerson person) {
        System.out.println(person.toString());
    }
}