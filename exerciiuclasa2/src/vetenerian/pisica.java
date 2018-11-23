package vetenerian;

public class pisica implements WildAnimalPet{


    @Override
    public void makeNoise() {

        System.out.println("meow");


    }
    public void sleep(){
        System.out.println("zzzzzzz");
    }

    @Override
    public void play() {
        System.out.println("(Glare)");

    }
}
