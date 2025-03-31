public class Oiseau extends Animal {
    private String envergureDesAiles;

    public Oiseau(String name, int age, String envergureDesAiles) {
        super(name, age);
        this.envergureDesAiles = envergureDesAiles;
    }

    public String getEnvergureDesAiles() {
        return envergureDesAiles;
    }

    public void setEnvergureDesAiles(String envergureDesAiles) {
        this.envergureDesAiles = envergureDesAiles;
    }
}
