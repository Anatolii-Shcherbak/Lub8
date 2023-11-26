package Task2;

public class Blowfish extends Fish implements AnimalBehavior, AnimalMove, AnimalName {
    int lifeExpectancy;

    public Blowfish(String name, int age, double weight, String tribe, int lifeExpectancy ) {
        super(name, age, weight, tribe);
        this.lifeExpectancy = lifeExpectancy;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Weight: " + weight +  ", tribe: " + tribe +  ", lifeExpectancy: " + lifeExpectancy ;
    }

    @Override
    public void sleep() {
        System.out.println("Do you really belive that THAT fish sleeping? (( R_I_P");
    }

    @Override
    public void move() {
        System.out.println("Blowfish swims");
    }
    public String getName() {
        return name;
    }
}
