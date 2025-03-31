public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 5);
        Mamifere mamifere = new Mamifere("Chien", 3, "Poils");
        Oiseau oiseau = new Oiseau("Aigle", 2, "1.5m");

        animal.manger();
        animal.dormir();
        mamifere.allaiter();

        oiseau.voler();
    }
}