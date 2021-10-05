public class GoodPerson {
    private Code code;
    private final String firstName;
    private final String lastName;

    public Code getCode() {
        return code;
    }
    public void setCode(Code code) {
        this.code = code;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }

    GoodPerson(Code code, String firstName, String lastName) {
        this.code = code;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "GoodPerson [code=" + code + ", firstName=" + firstName + ", lastName=" + lastName + "]";
    }
}