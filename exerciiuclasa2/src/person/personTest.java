package person;

public class personTest {
    public static void main(String[] args) {
        person Vito = new person("Don Vito", 100);
        person John= new person("John Doe", 200);
        child Alex= new child("Alex",50);

        System.out.println(" Alex: " + Alex);
        System.out.println(John);

        Vito.run();
        Vito.run();
        Vito.run();
        Vito.showEnergy();
        Vito.sleep();
        Vito.showEnergy();

        for (int i= 0; i<5; i++){
            John.run();
        }
        John.showEnergy();
        Alex.showEnergy();
        Alex.run();
        Alex.showEnergy();
        Alex.sleep();
        Alex.showEnergy();

    }
}
