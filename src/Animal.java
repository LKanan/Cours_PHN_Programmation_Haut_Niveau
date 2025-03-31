public class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void manger() {
        System.out.println(this.name + "est en train de manger...");
    }

    public void dormir() {
        System.out.println(this.name + "est en train de dormir...");
    }
}
