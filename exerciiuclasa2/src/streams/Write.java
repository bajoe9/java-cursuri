package streams;

import java.io.*;

public class Write {
    public static void main(String[] args) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("src/streams/numbers.txt", true));
            writer.write("6");
            writer.write("9");
            writer.write("3");
            writer.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
