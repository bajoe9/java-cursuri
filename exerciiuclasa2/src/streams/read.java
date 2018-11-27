package streams;
//daca dati exception fa da toate exceptile (errori)

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class read {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/streams/numbers.txt"));
            //FileInputStream stream = new FileInputStream( "src/streams/numbers.txt");
            String number;
            while ((number = reader.readLine()) !=null) {
                System.out.println(number);

            }
           reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
