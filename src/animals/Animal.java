package animals;

public abstract class Animal {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void makeNoise();

    public abstract void eat();

    public abstract void getDescription();

}

