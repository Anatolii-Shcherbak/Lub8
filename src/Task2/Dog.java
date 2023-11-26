package Task2;

public class Dog extends Mammal implements AnimalBehavior, AnimalMove, AnimalName {
    String eyecolor;

    public Dog(String name, int age, double weight, String SkinColour, String eyecolor ) {
        super(name, age, weight, SkinColour);
        this.eyecolor = eyecolor;
    }
    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Weight: " + weight +  ", SkinColour: " + SkinColour +  ", eyecolor: " + eyecolor ;
    }

    @Override
    public void sleep() {
        System.out.println("Dogs: " + "Sneezzzzzzzz");
    }

    @Override
    public void move() {
        System.out.println("Dog walking");
    }

    public String getName() {
        return name;
    }
}
