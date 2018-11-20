package person;

public class person {

    //daca puntei class final opriti si asa sa mostenesteasca

    protected String name;
    protected Integer energy;
    protected Boolean alive = true;

    //private imi piedica mostenirea valorilor

    public person(String name, Integer energy) {
        this.name = name;
        this.energy = energy;
    }

    public void run() {
        if (!alive) {
            return;
        }
        energy -= 30;
        if (energy <= 0) {
            alive = false;
        }
    }

    public void sleep() {
        if (!alive) {
            return;
        }
        energy = 100;
    }

    public void showEnergy() {
        System.out.println(name + " energy: " + energy);
    }

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", energy=" + energy +
                ", alive=" + alive +
                '}';
    }
}

