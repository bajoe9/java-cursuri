package vetenerian;

public class petTest {
    public static void main(String[] args) {
        //poti sa pui si animal dar daca animal main precis poate sa face lucul lui mai specific al lui

        pisica x = new pisica();
        Caine y = new Caine();

        petOwner Elvis = new petOwner(x, y);
        vet Luka = new vet();

        Elvis.takePetsToVet(Luka);
        Elvis.playWithPets();
        x.sleep();



    }
}
