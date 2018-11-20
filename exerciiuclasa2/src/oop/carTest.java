package oop;

public class carTest {
    public static void main(String[] args) {
        car bmv = new car(90f, 9f, true);

        car dacia= new car(90f,9f,true);
                bmv.start();
        bmv.drive(180);
        bmv.drive( 80);
        System.out.println(bmv.getFuel());
        System.out.println(bmv.range());
        bmv.wheels = 4;
        System.out.println(dacia.wheels);
        System.out.println(bmv.wheels);

    }
}
