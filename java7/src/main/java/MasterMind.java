import com.google.common.primitives.Chars;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MasterMind {


    public static void main(String[] args) {
        new MasterMind().run();
    }

         public MasterMind() {
        }

         public void  run(){
        int number= randomNumber();
              //read tried using scanner
             // convert tried number into digits list
             //for each tried digit verify digits.contains
             //for each index verify digits equals
   }

    private int randomNumber() {
        Integer number;
        Set digits;
        do {
            number = (int) Math.random() * 987;
            System.out.println(number);
        } while (getNumberOfDigits(number)!=3);
        return number;

    }

    private int getNumberOfDigits(Integer number) {
        List<Character> chars = Chars.asList(number.toString().toCharArray());
        Set<Character> digits = new HashSet<Character>(chars);
        return digits.size();
    }
}
