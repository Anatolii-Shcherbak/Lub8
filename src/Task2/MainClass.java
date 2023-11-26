package Task2;

import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {
        Animal animal[] = new Animal[6];
        animal[0] = new Mammal("Some Mammal", 5, 10.0, "Gray");
        animal[1] = new Dog("vlad", 5, 5.0, "Brown", "Blue");
        animal[3] = new Bird("kik", 5, 3.0, "f");
        animal[2] = new Pigeon("dvld", 5, 4.0, "f", "idk");
        animal[5] = new Fish("dvd", 5, 2.0, "f");
        animal[4] = new Blowfish("qe", 5, 4.0, "f", 3);

       String name = animal[1].getName();

        animal[1].getVoice();
//        for(int i = 0; i<animal.length; i++) {
//            System.out.println(animal[i]);
//        }
        AnimalBehavior animalbehaiv[] = new AnimalBehavior[3];
        animalbehaiv[0] = new Dog("vlad", 5, 5.0, "Brown", "Blue");
        animalbehaiv[1] = new Pigeon("dvld", 5, 4.0, "f", "idk");
        animalbehaiv[2] = new Blowfish("qe", 5, 4.0, "f", 3);

      for (AnimalBehavior AnimalBehavior : animalbehaiv)
      {
          AnimalBehavior.sleep();
          ((AnimalMove) AnimalBehavior).move();
        AnimalName.calledname(name);


      }


    }
}