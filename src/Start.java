import animals.Bear;
import animals.Cat;
import animals.Dog;
import animals.Animal;
import vets.Veterinarian;

public class Start {
    public static void main(String[] args) {
        Animal[] pets = new Animal[]{
                new Dog("Rex"),
                new Cat("Frida"),
                new Bear("Mechka"),
                new Dog("Alfa"),
                new Cat("Olaf")
        };

        Veterinarian vet = new Veterinarian();
        for (Animal animal : pets) {
            vet.treatAnimal(animal);
        }

        for (Animal pet : pets) {
            pet.makeNoise();
            pet.eat();
        }
    }
}