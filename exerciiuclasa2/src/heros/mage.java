package heros;

public class mage extends Hero {

    public mage(Integer energy, Integer life) {
        super(energy, life);
    }

    @Override
    public void takeDamage() {
        life-=5;
        energy+=4;


    }

    @Override
    public void attack() {
        energy-=3;

    }
}
