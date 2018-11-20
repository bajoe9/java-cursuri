package person;

public class child extends person {
    public child(String name, Integer energy) {
        super(name, energy);
    }

    public void eat() {
        energy++;
    }

    @Override
    public void sleep() {
        energy = 50;
    }
}

