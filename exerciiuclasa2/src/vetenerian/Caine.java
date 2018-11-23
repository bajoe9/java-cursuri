package vetenerian;

public class Caine implements WildAnimalPet{


    @Override
    public void makeNoise() {
        System.out.println("woof woff");

    }

    @Override
    public void play() {
        System.out.println("Roll Over");

    }
}
