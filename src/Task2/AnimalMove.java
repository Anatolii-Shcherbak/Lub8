package Task2;

public interface AnimalMove {
    default void move() {
        System.out.println("Animal moves.");
    }
}
