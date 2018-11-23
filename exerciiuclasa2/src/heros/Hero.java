package heros;

import java.security.InvalidParameterException;

abstract public class Hero {
   protected Integer energy;
   protected Integer life;
    protected boolean isAlive;

    public Hero(Integer energy, Integer life)
    throws InvalidParameterException
    {
        this.energy = energy;
        if (life <=0){
            throw new InvalidParameterException();
        }
        this.life = life;
        this.isAlive = true;
    }

    public void takeDamage(){
        if (!isAlive) return;
        doTakeDamage();
    }
    abstract void doTakeDamage();


         public void attack(){
        if (!isAlive) return;
        doAttack();
        }
        abstract void doAttack();

    @Override
    public String toString() {
        return "Hero{" +
                "energy=" + energy +
                ", life=" + life +
                '}';
    }

}
