package heros;

public class battleTest {
    public static void main(String[] args) {
        warrior batman = new warrior(20,20);
        mage mercutio = new mage(30,10);
        battle(batman, mercutio);


    }//trebuie exciplit sa ruleze mai precis sa vedeti
    public static void battle(Hero aHero, Hero aNotherHero){
        aHero.attack();
        aNotherHero.takeDamage();
        System.out.println(aHero);
        System.out.println(aNotherHero);
        aNotherHero.attack();
        aHero.takeDamage();
        System.out.println(aHero);
        System.out.println(aNotherHero);
        aHero.attack();
        aNotherHero.takeDamage();
        System.out.println(aHero);
        System.out.println(aNotherHero);
        aNotherHero.attack();
        aHero.takeDamage();
        System.out.println(aHero);
        System.out.println(aNotherHero);
        aHero.attack();
        aNotherHero.takeDamage();
        System.out.println(aHero);
        System.out.println(aNotherHero);
        aNotherHero.attack();
        aHero.takeDamage();
        System.out.println(aHero);
        System.out.println(aNotherHero);
    }
    

}
