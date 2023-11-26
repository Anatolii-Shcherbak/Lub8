package Task2;

public class Pigeon extends Bird implements AnimalBehavior, AnimalMove, AnimalName  {
    String species;

    public Pigeon(String name, int age, double weight, String featherColor,  String species ) {
        super(name, age, weight, featherColor);
        this.species = species;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Weight: " + weight +  ", featherColor: " + featherColor +  ", species: " + species ;
    }

    @Override
    public void sleep() {
        System.out.println("Pigeon's cute when it's sleeping");
    }

    @Override
    public void move() {
        System.out.println("Pigeon Idk slips:?");
    }
    public String getName() {
        return name;
    }
}
