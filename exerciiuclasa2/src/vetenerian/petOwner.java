package vetenerian;

public class petOwner {
    //
    protected WildAnimalPet firstPet;
    protected WildAnimalPet secondPet;


    public petOwner(WildAnimalPet firstPet, WildAnimalPet secondPet) {
        this.firstPet = firstPet;
        this.secondPet = secondPet;
    }

    public  void takePetsToVet(vet vet){
        vet.giveShot(firstPet);
        vet.giveShot(secondPet);

    }
    public void playWithPets(){
        firstPet.play();
        secondPet.play();
    }
}
