package heros;

abstract public class Hero {
   protected Integer energy;
   protected Integer life;

    public Hero(Integer energy, Integer life) {
        this.energy = energy;
        this.life = life;
    }

    abstract public void takeDamage();
        abstract public void attack();

    @Override
    public String toString() {
        return "Hero{" +
                "energy=" + energy +
                ", life=" + life +
                '}';
    }
}
