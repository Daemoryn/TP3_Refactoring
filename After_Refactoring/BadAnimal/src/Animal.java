public class Animal {
    String nomEspece;
    double tailleMaxAdulteInCentimeter;
    int age;
    Genre genre;

    public Animal(String nomEspece, double tailleMaxAdulteInCentimeter, int age, Genre genre) {
        this.nomEspece = nomEspece;
        this.tailleMaxAdulteInCentimeter = tailleMaxAdulteInCentimeter;
        this.age = age;
        this.genre = genre;
    }

    public String getNomEspece() {
        return nomEspece;
    }
    public void setNomEspece(String nomEspece) {
        this.nomEspece = nomEspece;
    }
    public double getTailleMaxAdulteInCentimeter() {
        return tailleMaxAdulteInCentimeter;
    }
    public void setTailleMaxAdulteInCentimeter(double tailleMaxAdulteInCentimeter) {
        this.tailleMaxAdulteInCentimeter = tailleMaxAdulteInCentimeter;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public Genre getGenre() {
        return genre;
    }
    public void setGenre(Genre genre) {
        this.genre = genre;
    }
}