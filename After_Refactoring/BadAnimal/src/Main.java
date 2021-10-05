public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Panthera leo", 2.50, 2, Genre.masculin);
        System.out.println("Création d'un " + animal1.getNomEspece() + " " + animal1.getGenre() + " de taille "
                + animal1.getTailleMaxAdulteInCentimeter() + " de " + animal1.getAge() + ".");
    }
    // TODO: Refactorer la classe Animal avec "Extract Delegate" (nomEspece et tailleMaxAdulteInCentimeter dans une classe Espece)
}
