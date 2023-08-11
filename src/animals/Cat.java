package animals;

public class Cat extends Animal {

    public Cat(String name) {
        this.setName(name);
    }

    @Override
    public void makeNoise() {
        System.out.println(getName() + " is a cat and it meows");
    }

    @Override
    public void eat(){
        System.out.println(getName() + " is a cat and it eats cat-food & drinks milk");
    }

    @Override
    public void getDescription() {
        System.out.println(getName() + " is a cat and it is usually small size, four paws, long tail & long/short fur");
    }

}
