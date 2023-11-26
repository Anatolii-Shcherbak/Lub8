package Task2;

public class Fish extends Animal implements AnimalMove, AnimalName {
    String tribe;
    @Override
    public void eat() {
    }

    @Override
    public String getVoice() {
        return null;
    }

    public Fish(String name, int age, double weight, String tribe) {
        super(name, age, weight);
        this.tribe = tribe;
    }
    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Weight: " + weight +  ", tribe: " + tribe;
    }

    @Override
    public void move() {
        System.out.println("Move: Fish moves under the water");
    }
}
