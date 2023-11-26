package Task2;

public class Mammal extends Animal implements AnimalMove, AnimalName  {
    String SkinColour;
    @Override
    public void eat() {
    }

    @Override
    public String getVoice() {
        return null;
    }

    public Mammal(String name, int age, double weight, String SkinColour) {
        super(name, age, weight);
        this.SkinColour = SkinColour;
    }
    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Weight: " + weight +  ", SkinColour: " + SkinColour ;
    }

    @Override
    public void move() {
        System.out.println("Move: Mammals moves wit their legs");
    }

}