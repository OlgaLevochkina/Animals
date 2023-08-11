package animals;

public class Dog extends Animal {

    public Dog(String name) {
        this.setName(name);
    }

    @Override
    public void makeNoise() {
        System.out.println(getName() + " is a dog and it barks");
    }

    @Override
    public void eat(){
        System.out.println(getName() + " is a dog and it eats meat & dog-food");
    }

    @Override
    public void getDescription() {
        System.out.println(getName() + " is a dog and it is usually average size, four paws, long tail & long/short fur");
    }

}
