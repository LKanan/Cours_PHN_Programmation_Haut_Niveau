public class ChauveSouris extends Mamifere implements Volant {
    public ChauveSouris(String name, int age, String pellage) {
        super(name, age, pellage);
    }

    @Override
    public void voler() {
        System.out.println(this.getName() + " est en train de voler...");
    }
}
