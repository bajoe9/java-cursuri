package oop;

public class carTest {
    public static void main(String[] args) {
        car bmv = new car();
        bmv.fuel = 90;
        bmv.fuelConsumption= 9;
        bmv.started = false;
                bmv.start();
        bmv.drive(180);
        bmv.drive( 980);
        System.out.println(bmv.fuel);
        System.out.println(bmv.range());

    }
}
