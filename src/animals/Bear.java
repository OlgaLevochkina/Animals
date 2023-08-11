package animals;

public class Bear extends Animal {

    public Bear(String name) {
        this.setName(name);
    }

    @Override
    public void makeNoise() {
        System.out.println(getName() + " is a bear and it roars");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is a bear and it eats meat & berries, grain, fish, insects, birds and mammals");
    }

    @Override
    public void getDescription() {
        System.out.println(getName() + " is a bear and it is usually big size, four paws, short tail & short fur");
    }

}
