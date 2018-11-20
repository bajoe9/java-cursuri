package dog;

import java.util.Scanner;

public class dogTest{
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        dog someDog = new dog();
        someDog.size = reader.nextInt();
        someDog.bark(reader.nextInt());

    }
}
