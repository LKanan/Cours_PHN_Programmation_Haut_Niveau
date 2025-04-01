public class Chien extends Mamifere{

    public Chien(String nom, int age, String pellage) {
        super(nom, age, pellage);
    }
    @Override
    public void faireDuBruit() {
        System.out.println(this.getName() + " fait un aboiement...");
    }
}
