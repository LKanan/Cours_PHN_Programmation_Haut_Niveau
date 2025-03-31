public abstract class Mamifere extends Animal {
    private String pellage;

    public Mamifere(String name, int age, String pellage) {
        super(name, age);
        this.pellage = pellage;
    }

    public String getPellage() {
        return pellage;
    }

    public void setPellage(String pellage) {
        this.pellage = pellage;
    }

    public void allaiter() {
        System.out.println(this.getName() + " est en train d'allaiter...");
    }
}
