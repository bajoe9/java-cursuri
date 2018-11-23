package heros;

public class warrior extends Hero{


    public warrior(Integer energy, Integer life) {
        super(energy, life);
    }

    @Override
    public void doTakeDamage() {
        life-=3;
    }

    @Override
    public void doAttack() {
        energy--;

    }
}
