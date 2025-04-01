public class Main {
    public static void main(String[] args) {
//        Mamifere mamifere = new Mamifere("Chien", 3, "Poils");
//        Oiseau oiseau = new Oiseau("Aigle", 2, "1.5m");
        ChauveSouris chauveSouris = new ChauveSouris("Batman", 1, "Poils");

        chauveSouris.manger();
        chauveSouris.dormir();

//        oiseau.voler();
        chauveSouris.allaiter();
        chauveSouris.voler();
        chauveSouris.chanter();

    }
}