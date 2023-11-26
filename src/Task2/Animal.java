package Task2;
public abstract class Animal implements AnimalName {
    String name;
    int age;
    double weight;
    public Animal(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    public abstract void eat();
    public String getName() {
        return name;
    }
    public abstract String getVoice();

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Weight: " + weight;
    }

}
