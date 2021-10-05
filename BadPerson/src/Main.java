import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();
        name.add("Bob");
        name.add("Marley");
        Person p1 = new Person(1, name);

        System.out.println("The person code of "+p1.getFirstName()+" "+p1.getLastName()+" is "+p1.getCode()+". :)");
    }
}

