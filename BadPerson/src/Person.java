import java.util.ArrayList;

public class Person {
    //TODO: faire un enum
    //TODO: pourquoi c'est public d'ailleur ?
    public static final int studentCode = 1, teacherCode = 2, visitorCode = 3;
    public int code;
    //TODO: séparer name en lastName et firstName
    private final ArrayList<String> name;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getFirstName() {
        return name.get(0);
    }

    public String getLastName() {
        return name.get(1);
    }

    public Person(int code, ArrayList<String> name) {
        if (code == 1 || code == 2 || code == 3) {
            this.code = code;
        }
        this.name = name;
    }
}
